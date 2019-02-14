import Health.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void setUp()  {
        spell = new Spell("blind", 10, "throw", 2);
    }

    @Test
    public void getName() {
        assertEquals("blind", spell.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(10, spell.getPrice());
    }

    @Test
    public void getAction() {
        assertEquals("throw", spell.getAction());
    }

    @Test
    public void getDamageValue() {
        assertEquals(2, spell.getDamageValue());
    }
}
