package practice_15.Z8;

public class Character {
    int health;
    int damage;
    int armor;
    int magic;

    public Character(Builder builder) {
        this.health = builder.getHealth();
        this.damage = builder.getDamage();
        this.armor = builder.getArmor();
        this.magic = builder.getMagic();
    }

    @Override
    public String toString() {
        return "Character{" +
                "health=" + health +
                ", damage=" + damage +
                ", armor=" + armor +
                ", magic=" + magic +
                '}';
    }
}
