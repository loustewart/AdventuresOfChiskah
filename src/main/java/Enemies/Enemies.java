package Enemies;

public abstract class Enemies {

    private String name;
    private int healthValue;
    private int damageValue;
    private String specialMove;

    public Enemies(String name, int healthValue, int damageValue, String specialMove) {
        this.name = name;
        this.healthValue = healthValue;
        this.damageValue = damageValue;
        this.specialMove = specialMove;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public String getSpecialMove() {
        return specialMove;
    }
}
