package com.company;

public class ShipMain {

    public static void main(String[] args) {
	// write your code here
        Ship ship1 = new Boat();
        Ship ship2 = new Cruise();
        ShipUtil.search(ship1);
        ShipUtil.search(ship2);
    }
}
