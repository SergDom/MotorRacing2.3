package MotorRacing;

public class Race {
    public static void main(String[] args) {

        MotorCars car1 = new MotorCars("Lada","2109",1.7);
        MotorCars car2 = new MotorCars("Ford","Mustang",3.5);
        MotorCars car3 = new MotorCars("Mazda","RX-7",1.3);
        MotorCars car4 = new MotorCars("Toyota","Supra",2.0);


        Trucks truck1 = new Trucks("KAMAZ","4326-9",17);
        Trucks truck2 = new Trucks("Tatra","Phoenix",12.5);
        Trucks truck3 = new Trucks("Renault","Phoenix",14.5);
        Trucks truck4 = new Trucks("Iveco","Valtr Racing",13.8);


        Buses bus1 = new Buses("AEC", " Routemaster", 9.6);
        Buses bus2 = new Buses("KAMAZ", "6282", 0);
        Buses bus3 = new Buses("Göppel", "Extra Grand", 9.3);
        Buses bus4 = new Buses("MAZ", "215", 8.2);

        DriverB Alex = new DriverB("Alex", 'B',10);
        DriverC Vasiliy = new DriverC("Vasiliy", 'C',2);
        DriverD Ivan = new DriverD("Ivan", 'D',7);


        System.out.println(Alex);
        Alex.DriverInfo(car1);

        System.out.println(Vasiliy);
        Vasiliy.DriverInfo(truck3);

        System.out.println(Ivan);
        Ivan.DriverInfo(bus3);



    }
}
