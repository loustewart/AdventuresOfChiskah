import Players.Wizards;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardsTest {

    Wizards wizards;

    @Before
    public void before(){
        wizards = new Wizards("Gandolf", 30, 10);
    }

    @Test
    public void hasName(){
        assertEquals("Gandolf", wizards.getName());
    }


    @Test
    public void hasHealthPoints() {
        assertEquals(30, wizards.getHealthPoints());
    }

    @Test
    public void getCoins() {
        assertEquals(10, wizards.getCoins());
    }
}
