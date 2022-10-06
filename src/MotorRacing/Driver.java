package MotorRacing;


abstract public class Driver <T extends Transport & Competing> {
    final private String name;
    final private Character typeOfLicence;
    private double experience;

    public Driver (String name, Character typeOfLicence, double experience) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException ("Укажите имя водителя");
        } else {
            this.name = name;
        }

        if (typeOfLicence != 'B' && typeOfLicence != 'C' && typeOfLicence != 'D') {
            throw new NullPointerException ("Нет прав, иди в автошколу");
        } else {
            this.typeOfLicence = typeOfLicence;
        }
        setExperience(experience);
    }

    public void startMove(T Cars){
        System.out.println(name + " Заводит " + Cars.getBrand() + " " + Cars.getModel());
    }
    public void finishMove(T Cars){
        System.out.println(name + " Останавиливает " + Cars.getBrand() + " " + Cars.getModel());
    }
    public void fillVehicle(T Cars){
        System.out.println(name + " Заправляет " + Cars.getBrand() + " " + Cars.getModel());
    }
    public Character getTypeOfLicence() {

        return typeOfLicence;
    }


    public double getExperience() {

        return experience;
    }

    public String getName() {

        return name;
    }

    public void setExperience(double experience) {
        if (experience <= 0) {
            throw new NullPointerException ("Иди учись водить!");
        } else {
            this.experience = experience;
        }

    }


    public void DriverInfo (T Cars) {
        System.out.println("Водитель " + name + " управляет " + Cars.getBrand() + " " + Cars.getModel() + " и будет участвовать в заезде");
    }
        @Override
    public String toString() {
        return "Имя водителя: " + name + " Категория прав: " + typeOfLicence + " Опыт вождения: " + experience;
    }
}
