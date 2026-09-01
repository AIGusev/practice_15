package practice_15.Z8;

public class Builder {

    private int health = 0;
    private int damage = 0;
    private int armor = 0;
    private int magic = 0;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagic() {
        return magic;
    }

    public Builder setHealth(int health) {   // ← Builder (не void) Вот тут мне подсказал ИИ((
        this.health = health;
        return this;
    }

    public Builder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public Builder setArmor(int armor) {
        this.armor = armor;
        return this;
    }

    public Builder setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public Character build() {
        return new Character(this);
    }
}