package Weapons;

public abstract class Weapon {

    private String name;
    private String action;
    private int damageValue;

    public Weapon(String name, String action, int damageValue){
        this.name = name;
        this.action = action;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
