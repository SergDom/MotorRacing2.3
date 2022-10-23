package Hashes_and_maps;

import java.util.Objects;

public class PassportData {
    private final Integer passportID;
    private  String name;
    private  String midname;
    private  String surname;
    private  int birthdate;


    public PassportData(Integer passportID, String name, String midname, String surname, int birthdate) {

        if (passportID == null || passportID < 0) {
        throw new IllegalArgumentException ("Не указан номер паспорта");
    } else {
        this.passportID = passportID;
    }

        this.name = name;

        if (midname.isEmpty()) {
            this.midname = null;
        } else {
            this.midname = midname;
        }
        this.surname = surname;
        this.birthdate = birthdate;

    }


    public String getName() {

        return name;
    }

    public String getMidname() {

        return midname;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getPassportID() {
        return passportID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportData that = (PassportData) o;
        return birthdate == that.birthdate && Objects.equals(passportID, that.passportID) && Objects.equals(name, that.name) && Objects.equals(midname, that.midname) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID);
    }

    @Override
    public String toString() {
        return "Номер паспорта: " + passportID + " Имя: " + name + " Отчество(если есть): " + midname +
                " Фамилия: " + surname +
                " Год рождения: " + birthdate + "\n";
    }
}
