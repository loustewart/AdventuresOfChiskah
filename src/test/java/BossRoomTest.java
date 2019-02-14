
import Enemies.Boss;
import Rooms.BossRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class BossRoomTest {

    BossRoom bossRoom;
    Boss boss;

    @Before
    public void setUp()  {
        boss = new Boss("Gondred", 200, 20, "smash");
        bossRoom = new BossRoom("Final Challenge", 50, 10, boss);
    }

    @Test
    public void canGetName() {
        assertEquals("Final Challenge", bossRoom.getName());
    }

    @Test
    public void getPrizeCoins() {
        assertEquals(50, bossRoom.getPrizeCoins());
    }

    @Test
    public void getRoomNumber() {
        assertEquals(10, bossRoom.getRoomNumber());
    }

    @Test
    public void canGetEnemy() {
        assertEquals("Gondred", this.boss.getName());
    }
}
