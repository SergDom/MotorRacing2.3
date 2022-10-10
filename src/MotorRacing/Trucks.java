package MotorRacing;

public class Trucks extends Transport implements Competing {

    enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private String textCapacity;

        LoadCapacity(String textCapacity) {

            this.textCapacity = textCapacity;
        }

        public String getTextCapacity() {
            return textCapacity;
        }
    }

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engine, String loadCapacity) {
        super(brand, model, engine);
        setloadCapacity(loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setloadCapacity(String loadCapacity) {
        if (loadCapacity == null || loadCapacity.isEmpty())
            this.loadCapacity = null;
        else {
            switch (loadCapacity) {
                case "с полной массой до 3,5 тонн":
                    this.loadCapacity = LoadCapacity.N1;
                    break;
                case "с полной массой свыше 3,5 до 12 тонн":
                    this.loadCapacity = LoadCapacity.N2;
                    break;
                case "с полной массой свыше 12 тонн":
                    this.loadCapacity = LoadCapacity.N3;
                    break;
                default:
                    this.loadCapacity = null;
            }
        }
    }
    public void TruckInfo() {
        if (loadCapacity == null) {
            System.out.println("Тип не указан");
        } else {
            System.out.println( getBrand() + " " + getModel() + " - ГрузоподЬемность " + loadCapacity.getTextCapacity());
        }
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
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика");
    }
}
