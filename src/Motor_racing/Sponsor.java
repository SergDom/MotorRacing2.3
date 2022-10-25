package Motor_racing;

public class Sponsor  {
    private final String name;
    int sum;


    public Sponsor(String name, int sum) {
        this.name = name;
        setSum(sum);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum <= 0) {
            throw new NullPointerException("Нет денег на заезд !!!");
        } else {
            this.sum = sum;
        }
    }



    public void sponsorCars () {
        System.out.println("Спонсор " + name + " выделяет на заезд " +getSum());
    }


    @Override
    public String toString() {
        return name + " сумма на заезад " + sum;
    }
}
