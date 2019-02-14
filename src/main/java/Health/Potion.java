package Health;

public class Potion extends HealingTool {


    private int healthValue;

    public Potion(String name, int price, String action, int healthValue) {
        super(name, price, action);
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }
}
