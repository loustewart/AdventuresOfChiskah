package Players;
import Health.Spell;
import Weapons.Weapon;
import java.util.ArrayList;

public abstract class Players {

    private String name;
    private int healthPoints;
    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;
    private int coins;

    public Players(String name, int healthPoints, int coins){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapon>();
        this.spells = new ArrayList<Spell>();
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getCoins() {
        return coins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
