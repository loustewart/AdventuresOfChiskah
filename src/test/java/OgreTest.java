import DefenseEnemies.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre("Uggy", "Ogre", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Uggy", ogre.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Ogre", ogre.getType());
    }

    @Test
    public void hasDefenseValue(){
        assertEquals(20, ogre.getDefenseValue());
    }
}
