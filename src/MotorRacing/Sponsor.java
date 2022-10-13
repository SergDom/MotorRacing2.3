package MotorRacing;

public class Sponsor <T extends Transport > {
    private final String name;
    Double sum;


    public Sponsor(String name, Double sum) {
        this.name = name;
        setSum(sum);
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        if (sum == null && sum <= 0) {
            throw new NullPointerException("Нет денег на заезд !!!");
        } else {
            this.sum = sum;
        }
    }

    public void sponsorCars (T MotorCars) {
        System.out.println("Спонсор " + name + " выделяет на заезд " +getSum() + " для автомобиля " + MotorCars.getBrand() + " " + MotorCars.getModel());
    }
}
