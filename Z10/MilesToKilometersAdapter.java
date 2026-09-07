package practice_15.Z10;

public class MilesToKilometersAdapter implements Distance{

    Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double value() {
        return miles.value() * 1.609344;
    }

    @Override
    public String unit() {
        return "км";
    }
}
