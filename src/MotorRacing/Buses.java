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

    @Override
    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить автобус и сменить резину");
    }

    @Override
    public String lapTime(String time) {
        System.out.println("Скорость круга автобуса");
        return time;
    }

    @Override
    public double maxSpeed (double speed) {
        System.out.println("Максимальная скорость автобуса");
        return speed;
    }


}
