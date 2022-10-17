package MotorRacing;

public class Mechanics<T extends Transport> {

    private final String name;
    private final String surname;
    String employer;


    public Mechanics(String name, String surname, String employer) {
        this.name = name;
        this.surname = surname;
        this.employer = employer;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void vehicleInspection(T transport) throws NoSuchMethodException {
        transport.vehicleInspection();
    }

    public void repairCar(T transport) {
        transport.repairCar();
    }

    @Override
    public String toString() {
        return name + " " + surname + " работает в компании " + employer;
    }
}
