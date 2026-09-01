package practice_15.Z5;

public class Main {
    static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory furnitureFactory1 = new ClassicFurnitureFactory();

        furnitureFactory.createChair().sit();
        furnitureFactory.createTable().put();
        System.out.println();
        furnitureFactory1.createChair().sit();
        furnitureFactory1.createTable().put();
    }
}
