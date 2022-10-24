package Motor_racing;

import java.util.List;

public class Race {
    public static void main(String[] args) throws NoSuchMethodException {
        Mechanics<MotorCars> Fedor = new Mechanics<MotorCars>("Fedor", "Pterovich", "FixitAll");
        Mechanics<Transport> Nikita = new Mechanics<Transport>("Nikita", "Ivanovich", "CrewCo");


        Sponsor MotorOil = new Sponsor("MotorOil", 200_000);
        Sponsor Rosneft = new Sponsor("Rosneft", 500_000);


        DriverB Alex = new DriverB("Alex", 'B', 10);
        DriverC Vasiliy = new DriverC("Vasiliy", 'C', 2);
        DriverD Ivan = new DriverD("Ivan", 'D', 7);

        MotorCars car1 = new MotorCars("Lada", "2109", 1.7, "Седан");
        car1.addDrivers(Alex);
        car1.addMechanics(Fedor);
        car1.addSponsor(MotorOil, Rosneft);

        MotorCars car2 = new MotorCars("Ford", "Mustang", 3.5, "Хэтчбек");
        MotorCars car3 = new MotorCars("Mazda", "RX-7", 1.3, "Купе");
        MotorCars car4 = new MotorCars("Toyota", "Supra", 2.0, "Универсал");


        Trucks truck1 = new Trucks("KAMAZ", "4326-9", 17, "с полной массой до 3,5 тонн");
        Trucks truck2 = new Trucks("Tatra", "Phoenix", 12.5, "");
        Trucks truck3 = new Trucks("Renault", "Phoenix", 14.5, "с полной массой свыше 3,5 до 12 тонн");
        Trucks truck4 = new Trucks("Iveco", "Valtr Racing", 13.8, "с полной массой свыше 12 тонн");

        truck2.addDrivers(Vasiliy);
        truck2.addMechanics(Nikita);
        truck2.addSponsor(MotorOil);


        Buses bus1 = new Buses("AEC", " Routemaster", 9.6, "до 10 мест");
        Buses bus2 = new Buses("KAMAZ", "6282", 0, "40-50 мест");
        Buses bus3 = new Buses("Göppel", "Extra Grand", 9.3, "до 60-80 мест");
        Buses bus4 = new Buses("MAZ", "215", 8.2, "100-120 мест");

        bus2.addDrivers(Vasiliy);
        bus2.addMechanics(Nikita);
        bus2.addSponsor(Rosneft);


        List<Transport> transports = List.of(
                car1, car2, car3, car4,
                truck1, truck2, truck3, truck4,
                bus1, bus2, bus3, bus4);


        System.out.println(Alex);
        Alex.DriverInfo(car1);

        System.out.println(Vasiliy);
        Vasiliy.DriverInfo(truck3);

        System.out.println(Ivan);
        Ivan.DriverInfo(bus3);


        car1.CarInfo();
        car4.CarInfo();

        truck1.TruckInfo();
        truck2.TruckInfo();

        bus1.BusesInfo();
        bus2.BusesInfo();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addVehicle(car4);
        serviceStation.addVehicle(truck4);
        serviceStation.service();
        serviceStation.service();

//        bus1.vehicleInspection();
        catchInspections(car3, truck3, bus1);
        printTotalInfo(car1);
        printTotalInfo(truck2);
        printTotalInfo(bus2);
    }

    public static void catchInspections(Transport... transports) {
        try {
            for (Transport transport : transports) {
                System.out.print(transport.getModel() + " ");
                transport.vehicleInspection();
            }
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printTotalInfo(Transport transport) {
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водитель " + transport.getDrivers());
        System.out.println("Спонсор " + transport.getSponsors());
        System.out.println("Механик " + transport.getMechanics());
        System.out.println();
    }
}

