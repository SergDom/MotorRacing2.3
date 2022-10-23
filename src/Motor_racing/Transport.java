package Motor_racing;

import java.util.*;

public abstract class Transport {

    final private String brand;
    final private String model;
    final private double engine;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanics<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brand, String model, double engine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Укажите марку";
        } else {
            this.model = model;
        }
        if (engine < 0) {
            this.engine = 0;
            System.out.println("Укажите обЪем двигателя");
        } else {
            this.engine = engine;
        }
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }

    public double getEngine() {

        return engine;
    }

    public void addDrivers(Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanics(Mechanics<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanics<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void vehicleInspection () throws NoSuchMethodException;

    public abstract void  repairCar ();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engine, engine) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engine, drivers, mechanics, sponsors);
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + engine;
    }
}

