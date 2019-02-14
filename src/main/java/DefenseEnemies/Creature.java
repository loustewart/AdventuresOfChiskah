package DefenseEnemies;

public abstract class Creature {

    private String name;
    private String type;
    private int defenseValue;

    public Creature(String name, String type, int defenseValue){
        this.name = name;
        this. type = type;
        this.defenseValue = defenseValue;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}