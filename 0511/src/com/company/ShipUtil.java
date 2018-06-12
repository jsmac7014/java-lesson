package com.company;

public class ShipUtil{
    public static void search(Ship s){
        if(s instanceof Boat){
            Boat b = (Boat)s;
            System.out.println("Boat : "+ b.name());
        }
        else if(s instanceof Cruise){
            Cruise c = (Cruise)s;
            System.out.println("Cruise :" +c.name());
        }
    }
}
