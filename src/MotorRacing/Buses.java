package MotorRacing;

public class Buses extends Transport implements Competing {

    enum SeatCapacity {
        EXTRASMALL("до 10 мест"),
        SMALL("до 25 мест"),
        MIDDLE("40-50 мест"),
        LARGE("до 60-80 мест"),
        EXTRALARGE("100-120 мест");


        private String textSeats;
        SeatCapacity(String textSeats) {
            this.textSeats =textSeats;
        }
        public String getTextSeats() {
            return textSeats;
        }
    }

    private SeatCapacity seatCapacity;

    public Buses(String brand, String model, double engine, String seatCapacity) {
        super(brand, model, engine);
        setseatCapacity(seatCapacity);
    }

    public SeatCapacity getSeatCapacity() {
        return seatCapacity;
    }

    public void setseatCapacity (String seatCapacity){
            if (seatCapacity == null || seatCapacity.isEmpty())
                this.seatCapacity = null;
            else {
                switch (seatCapacity) {
                    case "до 10 мест":
                        this.seatCapacity = SeatCapacity.EXTRASMALL;
                        break;
                    case "до 25 мест":
                        this.seatCapacity = SeatCapacity.SMALL;
                        break;
                    case "40-50 мест":
                        this.seatCapacity = SeatCapacity.MIDDLE;
                        break;
                    case "до 60-80 мест":
                        this.seatCapacity = SeatCapacity.LARGE;
                        break;
                    case "100-120 мест":
                        this.seatCapacity = SeatCapacity.EXTRALARGE;
                        break;
                    default:
                        this.seatCapacity = null;
                }
            }

        }
        public void BusesInfo () {
            if (seatCapacity == null) {
                System.out.println("Тип не указан");
            } else {
                System.out.println(getBrand() + " " + getModel() + " - ГрузоподЬемность " + seatCapacity.getTextSeats());
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
    public void vehicleInspection() throws NoSuchMethodException {
        throw new NoSuchMethodException("Автобус в диагностике не требуется");

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
