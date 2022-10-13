package MotorRacing;

public class Mechanics <T extends Transport >{

    private final String name;
    String employer;
    MotorCars motorCars;

    public Mechanics(String name, String employer, MotorCars motorCars) {
        this.name = name;
        this.employer = employer;
        this.motorCars = motorCars;
    }


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void service (T Transport){

    }
    public void repairCar (T Transport) {

    }
}
