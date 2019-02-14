import Enemies.Boss;
import Enemies.Boss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BossTest {

    Boss boss;


    @Before
    public void setUp()  {
        boss = new Boss("Gondred", 200, 20, "smash");
    }

    @Test
    public void canGetName() {
        assertEquals("Gondred", boss.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(200, boss.getHealthValue());
    }

    @Test
    public void canGetDamageValue() {
        assertEquals(20, boss.getDamageValue());
    }

    @Test
    public void canGetSpecialMove() {
        assertEquals("smash", boss.getSpecialMove());
    }
}
