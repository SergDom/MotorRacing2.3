package HashesAndMaps;

public class PassportData {

    String name;
    String midname;
    String surname;
    int birthdate;

    public PassportData(String name, String midname, String surname, int birthdate) {
        this.name = name;

        setMidname(midname);

        this.surname = surname;
        this.birthdate = birthdate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        if (midname.isEmpty()) {
            midname=null;
        } else{
            this.midname = midname;}
        }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Отчество(если есть): " + midname +
                " Фамилия: " + surname +
                " Год рождения: " + birthdate;
    }
}
