package practice_15.Z10;

public class Main {
    static void main(String[] args) {

        Miles miles = new Miles(10);
        System.out.println("Мили: " + miles);

        Kilometers kilometers = new Kilometers(10);
        System.out.println("Км: " + kilometers);

        Distance distance = new MilesToKilometersAdapter(miles);
        System.out.println("Адаптер: " + distance.value());
    }
}
