import DefenseEnemies.Unicorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicornTest {


    Unicorn unicorn;

    @Before
    public void before(){
        unicorn = new Unicorn("Fireball", "Dragon", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Fireball", unicorn.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Dragon", unicorn.getType());
    }

    @Test
    public void hasDefenseValue(){
        assertEquals(10, unicorn.getDefenseValue());
    }

}

