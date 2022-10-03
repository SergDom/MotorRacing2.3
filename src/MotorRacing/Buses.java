package MotorRacing;

public class Buses extends Cars implements Competing{

    public Buses(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void start() {
        System.out.println("Залесть в салон и завести двигатель");
    }

    @Override
    public void finish() {
        System.out.println("Выключить двигатель и выйти из салона");

    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }




}
