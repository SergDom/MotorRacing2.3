package MotorRacing;

public class MotorCars extends Transport implements Competing {

    private BodyType bodyType;

    public MotorCars(String brand, String model, double engine, String bodyType) {
        super(brand, model, engine);
        setBodyType(bodyType);


    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFFROAD("Внедорожник"),
        SUV("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String textType;

        BodyType(String textType) {
            this.textType = textType;
        }

        public String getTextType() {
            return textType;
        }

        //        public static BodyType TypeDefinition (String textType){
//            for (BodyType definition : values()) {
//                if (definition.getTextType().equals(textType)) {
//                    return definition;
//                }
//            }
//            return null;
//        }

    }
    public void Carinfo() {
        System.out.println( "Это тип авто " + bodyType.getTextType());
    }
    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty())
            this.bodyType = null;
        else {
            switch (bodyType) {
                case "Седан":
                    this.bodyType = BodyType.SEDAN;
                    break;
                case "Хетчбек":
                    this.bodyType = BodyType.HATCHBACK;
                    break;
                case "Купе":
                    this.bodyType = BodyType.COUPE;
                    break;
                case "Универсал":
                    this.bodyType = BodyType.WAGON;
                    break;
                case "Внедорожник":
                    this.bodyType = BodyType.OFFROAD;
                    break;
                case "Пикап":
                    this.bodyType = BodyType.PICKUP;
                    break;
                case "Кроссовер":
                    this.bodyType = BodyType.SUV;
                    break;
                case "Фургон":
                    this.bodyType = BodyType.VAN;
                    break;
                case "Минивэн":
                    this.bodyType = BodyType.MINIVAN;
                    break;
                default:
                    this.bodyType = null;
            }
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }


    @Override
    public void start() {
        System.out.println("Вставить ключ в замок зажигания и завести двигатель");
    }

    @Override
    public void finish() {
        System.out.println("Выключить зажигание и выйти из машины");

    }

    @Override
    public String toString() {
        return "Машина: " + super.toString() + " тип кузова " + bodyType.getTextType();

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
    public void maxSpeed() {
        System.out.println("Максимальная скорость у машины");

    }
}
