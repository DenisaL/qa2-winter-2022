package homework2;

import org.junit.jupiter.api.Test;

public class VehiclePractice {
    @Test
    public void homework2() {

    Vehicle car = new Vehicle();
    car.setVehicleType("Car, Mercedes C200 Avantgrade");
    car.setFuelConsumption(6.6);
    car.setTankCapacity(66);

    Vehicle train = new Vehicle();
    train.setVehicleType("Train");
    train.setFuelConsumption(400);
    train.setTankCapacity(6300);

    Vehicle plane = new Vehicle();
    plane.setVehicleType("Plane, Boeing 747");
    plane.setFuelConsumption(1600);
    plane.setTankCapacity(216840);

    Route route1 = new Route();
    route1.setStartingPoint("Riga");
    route1.setDestination("Warsaw");
    route1.setDistance(654.64);

    Route route2 = new Route();
    route2.setStartingPoint("Riga");
    route2.setDestination("Miami");
    route2.setDistance(8439);

    Route route3 = new Route();
    route3.setStartingPoint("Riga");
    route3.setDestination("Prague");
    route3.setDistance(1324);

    System.out.println(route1.getStartingPoint() + " to " + route1.getDestination());
    System.out.print(car.getVehicleType() + " " + car.getTankCapacity() + " ");
    if (car.getTankCapacity() >= route1.getDistance() / 100 * car.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    System.out.print(train.getVehicleType() + " " + train.getTankCapacity() + " ");
    if (train.getTankCapacity() >= route1.getDistance() / 100 * train.getFuelConsumption()) {
        System.out.println("Can be reached bt one fuel tank.");
    } else {
        System.out.println("Can`t be reached by one fuel tank.");
    }
    System.out.print(plane.getVehicleType() + " " + plane.getTankCapacity() + " ");
    if (plane.getTankCapacity() >= route1.getDistance() / 100 * plane.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
        System.out.println(" ");
    System.out.println(route2.getStartingPoint() + " to " + route2.getDestination());
    System.out.print(car.getVehicleType() + " " + car.getTankCapacity() + " ");
    if (car.getTankCapacity() >= route2.getDistance() / 100 * car.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    System.out.print(train.getVehicleType() + " " + train.getTankCapacity() + " ");
    if (train.getTankCapacity() >= route2.getDistance() / 100 * train.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    System.out.print(plane.getVehicleType() + " " + plane.getTankCapacity() + " ");
    if (plane.getTankCapacity() >= route2.getDistance() / 100 * plane.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank");
    }
        System.out.println(" ");
    System.out.println(route3.getStartingPoint() + " to " + route3.getDestination());
    System.out.print(car.getVehicleType() + " " + car.getTankCapacity() + " ");
    if (car.getTankCapacity() >= route3.getDistance() / 100 * car.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    System.out.print(train.getVehicleType() + " " + train.getTankCapacity() + " ");
    if (train.getTankCapacity() >= route3.getDistance() / 100 * train.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    System.out.print(plane.getVehicleType() + " " + plane.getTankCapacity() + " ");
    if (plane.getTankCapacity() >= route3.getDistance() / 100 * plane.getFuelConsumption()) {
        System.out.println("Can be reached by one fuel tank.");
    } else {
        System.out.println("Can't be reached by one fuel tank.");
    }
    }
}
