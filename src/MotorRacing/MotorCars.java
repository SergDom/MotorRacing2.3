package MotorRacing;

public class MotorCars extends Transport implements Competing{

    public MotorCars(String brand, String model, double engine) {
        super(brand, model, engine);

    }

    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFFROAD("Внедорожник"),
        SUV("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN ("Минивэн");

        private String textType;



        public static BodyType TypeDefinition (String textType){
            for (BodyType definition : values()) {
                if (definition.getTextType().equals(textType)) {
                    return definition;
                }
            }
            return null;
        }

        public void setTextType(String textType) {
            if (textType == null || textType.isBlank()){
            this.textType = "Нет данных";}
            else {
                this.textType = textType;
            }
        }
        public String getTextType() {
            return textType;
        }

        BodyType(String textType) {
            this.textType =textType;
        }
    }
    public void Carinfo(){
        System.out.println(super.toString() + " тип авто ");
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
