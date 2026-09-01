package practice_15.Z4;

public class Main {
    static void main(String[] args) {

        CreatingWeapon creatingWeapon = new CreatingWeapon();

        Weapon sword = creatingWeapon.weapon("sword");
        Weapon bow = creatingWeapon.weapon("bow");
        Weapon gun = creatingWeapon.weapon("gun");

        sword.use();
        bow.use();
        gun.use();
    }
}
