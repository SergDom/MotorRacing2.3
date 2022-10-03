package MotorRacing;

public class Trucks extends Cars implements Competing{

    public Trucks(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void start() {
        System.out.println("Запрыгнуть в кабину и завести двигатель");
    }

    @Override
    public void finish() {
        System.out.println("Выключить двигатель и спрыгнуть с подножки");

    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }
}
