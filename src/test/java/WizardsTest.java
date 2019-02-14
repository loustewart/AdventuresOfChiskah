import Players.Wizards;
import Weapons.Sword;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class WizardsTest {

    Wizards wizards;
    Sword sword;

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

    @Test
    public void canSetName(){
        wizards.setName("John");
        assertEquals("John", wizards.getName());
    }

//    @Test
//    public void hasWeaponsCollection(){
//        assertEquals(new ArrayList<Weapon>(), wizards.getWeapons());
//    }
}
