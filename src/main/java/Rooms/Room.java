package Rooms;

import Enemies.Enemies;

public abstract class Room {

    private String name;
    private int prizeCoins;

    private int roomNumber;

    public Room(String name, int prizeCoins, int roomNumber) {
        this.name = name;
        this.prizeCoins = prizeCoins;

        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public int getPrizeCoins() {
        return prizeCoins;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
