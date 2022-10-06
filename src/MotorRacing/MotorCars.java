package MotorRacing;

public class MotorCars extends Transport implements Competing{

    public MotorCars(String brand, String model, double engine) {

        super(brand, model, engine);
    }

    enum BodyType {
        SEDAN,
        HATCHBACK,
        COUPE,
        WAGON,
        OFFROAD,
        SUV,
        PICKUP,
        VAN,
        MINIVAN

    }
    @Override
    public void start() {
            System.out.println("Вставить ключ в замок зажигания и двигатель");
    }

    @Override
    public void finish() {
        System.out.println("Выключить зажигание и выйти из машины");

    }

    @Override
    public String toString() {
        return "Машина: " + super.toString();

    }

    @Override
    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить машину и сменить резину");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у машины");
    }

    @Override
    public void maxSpeed () {
        System.out.println("Максимальная скорость у машины");

    }
}
