package Motor_racing;

import java.util.ArrayDeque;
import java.util.Queue;


public class ServiceStation {

    private final Queue<Transport> vehicle = new ArrayDeque();

    public void addVehicle(Transport transport) {
        if (transport instanceof Buses){
            System.out.println("Автобусы в дагностике не нуждаются!");
        }
        vehicle.add(transport);
    }

    public void service() {
        if (!vehicle.isEmpty()) {
            Transport transport = vehicle.poll();
            transport.repairCar();
        }
    }
}
