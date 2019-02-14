import Health.Cleric;
import Health.Potion;
import Health.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Spell spell;

    @Before
    public void setUp() {
        cleric = new Cleric("Ivelore");
        potion = new Potion("protection", 20, "drink", 10 );
        spell = new Spell("blind", 10, "throw", 2);
    }

    @Test
    public void getName() {
        assertEquals("Ivelore", cleric.getName());
    }

    @Test
    public void potionsStartsEmpty() {
        assertEquals(0, cleric.potionsCount());
    }

    @Test
    public void spellsStartsEmpty() {
        assertEquals(0, cleric.spellsCount());
    }

    @Test
    public void addPotion() {
        cleric.addPotion(potion);
        assertEquals(1, cleric.potionsCount());
    }

    @Test
    public void addSpell() {
        cleric.addSpell(spell);
        assertEquals(1, cleric.spellsCount());

    }
}
