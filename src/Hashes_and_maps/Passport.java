package Hashes_and_maps;

import java.util.*;

public class Passport {

    private final static List<PassportData> pList = new ArrayList<>();

    public static void main(String[] args) {
        PassportData ivan = new PassportData(123456, "Ivan", "Ivanovich", "Ivanov", 1990);
        PassportData petr = new PassportData(234567, "Petr", "Petrovich", "Sidorov", 1999);
        PassportData ilia = new PassportData(234568, "Ilia", "Sergeevich", "Petrov", 1987);
        PassportData ilia2 = new PassportData(234567, "Ilia", "Sergeevich", "Petrov", 1987);
        addPassportData(ivan);
        addPassportData(petr);
        addPassportData(ilia);
        addPassportData(ilia2);

        System.out.println(pList);

        searchData(123);


    }

    public static void addPassportData(PassportData passportData) {
        PassportData p2 = searchData(passportData.getPassportID());
            if (p2 == null) {
                pList.add(passportData);
            } else {
                p2.setName(passportData.getName());
                p2.setSurname(passportData.getSurname());
                p2.setMidname(passportData.getMidname());
                p2.setBirthdate(passportData.getBirthdate());
            }
        }

    public static PassportData searchData(int ID) {
        for (PassportData passport : pList) {
            if (passport.getPassportID().equals(ID)) {
                return passport;
            }
        }
        return null;
    }

}