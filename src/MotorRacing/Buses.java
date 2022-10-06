package MotorRacing;

public class Buses extends Transport implements Competing {

    public Buses(String brand, String model, double engine) {

        super(brand, model, engine);
    }

    enum SeatCapacity {
        EXTRASMALL,
        SMALL,
        MIDDLE,
        LARGE,
        EXTRALARGE
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
    public void lapTime() {
        System.out.println("Скорость круга у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса");

    }


}
