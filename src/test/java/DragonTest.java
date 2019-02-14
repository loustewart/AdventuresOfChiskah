import DefenseEnemies.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Fireball", "Dragon", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", dragon.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Dragon", dragon.getType());
    }

    @Test
    public void hasDefenseValue(){
        assertEquals(10, dragon.getDefenseValue());
    }
}
