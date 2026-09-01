package practice_15.Z3;

public class Main {
    static void main(String[] args) {

        CreatingVehicles creatingVehicles = new CreatingVehicles();

        Vehicle car = creatingVehicles.vehicle("car");
        Vehicle bicycle = creatingVehicles.vehicle("bicycle");

        car.drive();
        bicycle.drive();
    }
}
