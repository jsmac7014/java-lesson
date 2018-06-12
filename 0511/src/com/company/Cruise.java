package com.company;

public class Cruise extends Ship{
    public int move(){
        System.out.println("Cruise Move");
        return 0;
    }
    public int carry(){
        System.out.println("Cruise Carry");
        return 1;
    }
    public String name(){
        System.out.println("Cruise name");
        return"this is name";
    }
}
