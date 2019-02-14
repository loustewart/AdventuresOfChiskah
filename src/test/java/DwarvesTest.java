import Players.Dwarves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarvesTest {

    Dwarves dwarves;

    @Before
    public void before(){
        dwarves = new Dwarves("Donald", 10, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Donald", dwarves.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, dwarves.getHealthPoints());
    }


    @Test
    public void hasCoins(){
        assertEquals(20, dwarves.getCoins());
    }
}
