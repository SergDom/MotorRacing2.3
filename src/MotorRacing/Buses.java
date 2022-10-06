package MotorRacing;

public class Buses extends Transport implements Competing {

    public Buses(String brand, String model, double engine) {

        super(brand, model, engine);
    }

    enum SeatCapacity {
        EXTRASMALL("до 10 мест"),
        SMALL("до 25 мест"),
        MIDDLE("40-50 мест"),
        LARGE("до 60-80 мест"),
        EXTRALARGE("100-120 мест");


        private String textSeats;

        public String getTextSeats() {
            return textSeats;
        }

        SeatCapacity(String textSeats) {
            this.textSeats =textSeats;
        }
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
