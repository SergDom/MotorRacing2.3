package MotorRacing;

import java.util.ArrayDeque;
import java.util.Queue;


public class ServiceStation {

    private final Queue<Transport> vehicle = new ArrayDeque();

    private void addVehicle(Transport transport) {
        vehicle.offer(transport);
    }

    public void addCar(MotorCars motorCars) {
        vehicle.offer(motorCars);
    }

    public void addTruck(Trucks trucks) {
        vehicle.offer(trucks);
    }

    public void service() {
        if (!vehicle.isEmpty()) {
            Transport transport = vehicle.poll();
            transport.repairCar();
        }
    }
}
