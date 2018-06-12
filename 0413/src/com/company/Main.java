package com.company;

class Car{
    private String name = "Car";
    void drive(){
        System.out.println(name+"가 달립니다");
    }
    void stop(){
        System.out.println("멈춰");
    }
}
class Ambulance extends Car{
    private String name = "Ambulance";
    void drive(){
        System.out.println("갓길로 달립니다. 쌩쌩~");
    }
    void siren(){
        System.out.println("비뽀비뽀~");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ambulance am1 = new Ambulance();
        Car car1 = new Car();
        Car car2 = new Ambulance();
        Ambulance am2 = (Ambulance)car2;

        if(car1 instanceof Ambulance){
            System.out.println("Ambulance!");
        }
        if(car1 instanceof Car){
            System.out.println("Car!");
        }
        if(car1 instanceof Object){
            System.out.println("car1는 객체이다");
        }

        if(car2 instanceof Ambulance){
            System.out.println("Ambulance!");
        }
        if(car2 instanceof  Car){
            System.out.println("Car!");
        }
        if(car2 instanceof Object){
            System.out.println("car2는 객체이다");
        }

    }
}
