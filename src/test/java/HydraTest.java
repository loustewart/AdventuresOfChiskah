import Enemies.Hydra;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HydraTest {

    Hydra hydra;

    @Before
    public void setUp()  {
        hydra = new Hydra("Mezgazi", 50, 6, "breath poison");
    }

    @Test
    public void canGetName() {
        assertEquals("Mezgazi", hydra.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(50, hydra.getHealthValue());
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(6, hydra.getDamageValue());
    }

    @Test
    public void canGetSpecialMove() {
        assertEquals("breath poison", hydra.getSpecialMove());
    }
}
