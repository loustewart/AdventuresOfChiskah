import Health.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    @Before
    public void setUp() {
        potion = new Potion("protection", 20, "drink", 10 );
    }

    @Test
    public void getName() {
        assertEquals("protection", potion.getName());
    }

    @Test
    public void getPrice() {
        assertEquals(20, potion.getPrice());
    }

    @Test
    public void getAction() {
        assertEquals("drink", potion.getAction());
    }

    @Test
    public void getHealthValue() {
        assertEquals(10, potion.getHealthValue());
    }
}
