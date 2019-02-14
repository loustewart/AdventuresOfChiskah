package Rooms;

import Enemies.Giant;
import Rooms.Room;

public class Hovel extends Room {

    Giant giant;

    public Hovel(String name, int prizeCoins, int roomNumber, Giant giant) {
        super(name, prizeCoins, roomNumber);
        this.giant = giant;
    }
}
