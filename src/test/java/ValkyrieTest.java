import Enemies.Valkyrie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValkyrieTest {

    Valkyrie valkyrie;

    @Before
    public void setUp()  {
        valkyrie = new Valkyrie("Arrja", 90, 10, "scream");
    }

    @Test
    public void canGetName() {
        assertEquals("Arrja", valkyrie.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(90, valkyrie.getHealthValue());
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(10, valkyrie.getDamageValue());
    }

    @Test
    public void canGetSpecialMove() {
        assertEquals("scream", valkyrie.getSpecialMove());
    }
}
