package practice_15.Z10;

public class Kilometers implements Distance {

    double value;

    public Kilometers(double value) {
        this.value = value;
    }

    @Override
    public double value() {
        return value;
    }

    @Override
    public String unit() {
        return "км";
    }

    @Override
    public String toString() {
        return "Kilometers{" +
                "value=" + value +
                '}';
    }
}
