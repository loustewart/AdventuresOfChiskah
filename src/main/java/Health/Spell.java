package Health;

public class Spell extends HealingTool {


    private int damageValue;

    public Spell(String name, int price, String action, int damageValue) {
        super(name, price, action);
        this.damageValue = damageValue;
    }


    public int getDamageValue() {
        return damageValue;
    }
}
