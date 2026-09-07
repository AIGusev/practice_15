package practice_15.Z10;

public class Miles implements Distance{

    double value;

    public Miles(double value) {
        this.value = value;
    }

    @Override
    public double value() {
        return value;
    }

    @Override
    public String unit() {
        return "Мили";
    }

    @Override
    public String toString() {
        return "Miles{" +
                "value=" + value +
                '}';
    }
}
