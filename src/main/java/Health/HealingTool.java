package Health;

public abstract class HealingTool {

    private String name;
    private int price;
    private String action;


    public HealingTool(String name, int price, String action) {
        this.name = name;
        this.price = price;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAction() {
        return action;
    }
}


