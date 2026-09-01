package practice_15.Z4;

public class CreatingWeapon {

    public Weapon weapon(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("sword")) {
            return new Sword();
        } else if (type.equals("bow")) {
            return new Bow();
        } else if (type.equals("gun")) {
            return new Gun();
        }
        return null;
    }
}
