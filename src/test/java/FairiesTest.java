import Players.Fairies;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FairiesTest {

    Fairies fairies;

    @Before
    public void before(){
        fairies = new Fairies("Fairy Faye", 30, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Fairy Faye", fairies.getName());
    }


    @Test
    public void hasHealthPoints() {
        assertEquals(30, fairies.getHealthPoints());
    }

    @Test
    public void getCoins() {
        assertEquals(10, fairies.getCoins());
    }
}
