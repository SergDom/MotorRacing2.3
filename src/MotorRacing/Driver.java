package MotorRacing;

public class Driver<M extends MotorCars> {
    final private String name;
    private String typeOfLicence;
    private double experience;

    public Driver(String name, String typeOfLicence, double experience) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException ("Нет прав, иди в автошколу");
        } else {
            this.name = name;
        }
        setTypeOfLicence(typeOfLicence);
        setExperience(experience);
    }

    public void startMove(){

    }
    public void finishMove(){

    }
    public void fillVehicle(){

    }
    public String getTypeOfLicence() {
        return typeOfLicence;
    }

    public void setTypeOfLicence(String typeOfLicence) {
        if (typeOfLicence == null || typeOfLicence.isEmpty()) {
            this.typeOfLicence = "Нет прав, иди в автошколу";
        } else {
            this.typeOfLicence = typeOfLicence;
        }

    }
    public double getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public void setExperience(double experience) {
        if (experience < 0) {
            this.experience = 0;
            System.out.println("Нет опыта вождения");
        } else {
            this.experience = experience;
        }

    }

    @Override
    public String toString() {
        return "Водитель: " + name + "Категория прав: " + typeOfLicence + "Опыт: " + experience;
    }
}
