package MotorRacing;

public abstract class Cars {

    private String brand;
    private String model;
    private double engine;

    public Cars(String brand, String model, double engine) {
        setBrand(brand);
        setModel(model);
        setEngine(engine);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine < 0) {
            this.engine = 0;
            System.out.println("Укажите обЪем двигателя");
        } else {
            this.engine = engine;
        }
    }

    public abstract void start();
    public abstract void finish();

    @Override
    public String toString() {
        return "Марка: " + brand + "Модель: " + model + "Объем двигателя: " + engine + " литра."; }

    }