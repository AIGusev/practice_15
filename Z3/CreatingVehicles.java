package practice_15.Z3;

public class CreatingVehicles {
    public Vehicle vehicle(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bicycle")) {
            return new Bicycle();
        }
        return null;
    }
}
