package MotorRacing;

public class Trucks extends Transport implements Competing{

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


    @Override
    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить грузовик и сменить резину");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у грузовика");
    }

    @Override
    public void maxSpeed () {
        System.out.println("Максимальная скорость у грузовика");
    }
}
