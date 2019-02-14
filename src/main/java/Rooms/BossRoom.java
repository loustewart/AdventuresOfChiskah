package Rooms;

import Enemies.Boss;
import Rooms.Room;

public class BossRoom extends Room {

    Boss boss;

    public BossRoom(String name, int prizeCoins, int roomNumber, Boss boss) {
        super(name, prizeCoins, roomNumber);
        this.boss = boss;
    }


}
