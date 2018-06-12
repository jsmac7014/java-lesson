package com.company;

class Bus extends Car{
    private String name = "Bus";
    void drive(){
        System.out.println(name + "는 시속 60km를 준수합니ㅏㄷ");
    }
}
public class Casting3 {
    public static void drive(Car tempCar){
        if(tempCar instanceof Ambulance){
            ((Ambulance) tempCar).drive();
        }
        else if(tempCar instanceof Bus){
            ((Bus) tempCar).drive();
        }
        else {
            tempCar.drive();
        }
    }
    public static void main(String[] args){
        Car car = new Car();
        Ambulance am = new Ambulance();
        Bus bus = new Bus();
        drive(car);
        drive(am);
        drive(bus);
    }
}
