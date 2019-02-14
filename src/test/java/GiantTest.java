import Enemies.Giant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantTest {

    Giant giant;

    @Before
    public void setUp()  {
        giant = new Giant("Bogir", 150, 15, "stamp");
    }

    @Test
    public void canGetName() {
        assertEquals("Bogir", giant.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(150, giant.getHealthValue());
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(15, giant.getDamageValue());
    }

    @Test
    public void canGetSpecialMove() {
        assertEquals("stamp", giant.getSpecialMove());
    }

}
