package HashesAndMaps;

import java.util.*;

public class Passport {

    static Map<Integer, PassportData> map = new HashMap<>();

    public static void main(String[] args) {
        PassportData first = new PassportData("Ivan", "Ivanovich", "Ivanov", 1990);
        PassportData second = new PassportData("Petr", "Petrovich", "Sidorov", 1999);
        addPassportData(123456, first);
        addPassportData(234567, second);


        printData();
    }

    public static void addPassportData(Integer ID, PassportData passportData) {
        map.put(ID, passportData);
    }

    public static void printData() {
        Arrays.toString(map.entrySet().toArray());
        for (Map.Entry<Integer, PassportData> entry : map.entrySet()) {
            System.out.println("Номер паспорта " + entry.getKey() + " : " + entry.getValue());
        }
    }
}