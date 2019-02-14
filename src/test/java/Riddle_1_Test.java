import Riddles.Riddle_1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Riddle_1_Test  {

    Riddle_1 riddle_1;

    @Before
    public void setUp()  {
        riddle_1 = new Riddle_1("What is it that after you take away the whole, some still remains?", "Wholesome", 10);
    }

    @Test
    public void canGetRiddle() {
        assertEquals("What is it that after you take away the whole, some still remains?", riddle_1.getRiddle());
    }

    @Test
    public void canGetAnswer() {
        assertEquals("Wholesome", riddle_1.getAnswer());
    }

    @Test
    public void canGetPrizeAmount() {
        assertEquals(10, riddle_1.getPrizeCoins());
    }
}
