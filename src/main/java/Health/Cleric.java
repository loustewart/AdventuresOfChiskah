package Health;

import java.util.ArrayList;

public class Cleric {

    private String name;
    private ArrayList<Potion> potions;
    private ArrayList<Spell> spells;

    public Cleric(String name) {
        this.name = name;
        this.potions = new ArrayList<Potion>();
        this.spells = new ArrayList<Spell>();
    }

    public String getName() {
        return name;
    }

    public int potionsCount() {
        return this.potions.size();
    }

    public int spellsCount() {
        return this.spells.size();
    }

    public void addPotion(Potion potion) {
        this.potions.add(potion);
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }




}
