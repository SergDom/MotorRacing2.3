package MotorRacing;

public class Driver {
    final private String name;
    private String typeOfLicence;
    private double experience;

    public Driver(String name, String typeOfLicence, double experience) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException ("Нет прав, иди в автошколу");
        } else {
            this.name = typeOfLicence;
        }

        setTypeOfLicence(typeOfLicence);
        setExperience(experience);
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
    public void setExperience(double experience) {
        if (experience < 0) {
            this.experience = 0;
            System.out.println("Нет опыта вождения");
        } else {
            this.experience = experience;
        }

    }
}
