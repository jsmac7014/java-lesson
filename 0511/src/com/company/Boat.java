package com.company;

public class Boat extends Ship{
    public int move(){
        System.out.println("Boat Move");
        return 0;
    }
    public int carry(){
        System.out.println("Boat Carry");
        return 1;
    }
    public String name(){
        System.out.println("Boat name");
        return"this is name";
    }
}
