package MotorRacing;


public class Driver<M extends Cars> {
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

    public void startMove(){
        System.out.println(name + " Заводит ");
    }
    public void finishMove(){

    }
    public void fillVehicle(){

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
        if (experience < 0) {
            this.experience = 0;
            System.out.println("Нет опыта вождения");
        } else {
            this.experience = experience;
        }

    }

    @Override
    public String toString() {
        return "Водитель: " + name + " Категория прав: " + typeOfLicence + " Опыт: " + experience;
    }
}
