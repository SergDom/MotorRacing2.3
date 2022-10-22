package HashesAndMaps;

public class PassportData {

    private final String name;
    private final String midname;
    private final String surname;
    private final int birthdate;

    public PassportData(String name, String midname, String surname, int birthdate) {
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


    @Override
    public String toString() {
        return "Имя: " + name + " Отчество(если есть): " + midname +
                " Фамилия: " + surname +
                " Год рождения: " + birthdate;
    }
}
