
import Enemies.Giant;
import Rooms.Hovel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HovelTest {

        Hovel hovel;
        Giant giant;

        @Before
        public void setUp()  {
            giant = new Giant("Bogir", 150, 15, "stamp");
            hovel = new Hovel("Giants Hovel", 50, 10, giant);
        }

        @Test
        public void canGetName() {
            assertEquals("Giants Hovel", hovel.getName());
        }

        @Test
        public void getPrizeCoins() {
            assertEquals(50, hovel.getPrizeCoins());
        }

        @Test
        public void getRoomNumber() {
            assertEquals(10, hovel.getRoomNumber());
        }

        @Test
        public void canGetEnemy() {
            assertEquals("Bogir", this.giant.getName());
        }
    }

