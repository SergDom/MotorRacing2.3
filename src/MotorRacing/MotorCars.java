package MotorRacing;

public class MotorCars extends Cars{

    public MotorCars(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void start() {
            System.out.println("Вствить ключ в замок зажигания и завести двигатель");
    }

    @Override
    public void finish() {
        System.out.println("Выключить зажигание и выйти из машины");

    }

    @Override
    public String toString() {
        return "Машина: " + super.toString();

    }
}
