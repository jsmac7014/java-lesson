package mobile;

class Car{
	String carName;
	String color;
	int velocity;
	
	Car(String carName, String color, int velocity){
		this.carName = carName;
		this.color = color;
		this.velocity = velocity;
	}
	
	String getCarName(){
		return carName;
	}
	void setCarName(String carName){
		this.carName = carName;
	}
	
	String getColor(){
		return color;
	}
	void setColor(String color){
		this.color = color;
	}
	
	int getVelocity(){
		return velocity;
	}
	void setVelocity(int velocity){
		this.velocity = velocity;
	}
	
	void start(){}
	void stop(){}
	
	void speedUp(){}
	void speedDown(){}
	void nowSpeed(){}
	
}

class Truck extends Car{
	int ton;
	int weight;
	int MAX_VELOCITY;
	
	Truck(String carName, String color, int velocity, int ton,int weight, int MAX_VELOCITY){
		super(carName,color,velocity);
		this.ton = ton;
		this.weight = weight;
		this.MAX_VELOCITY = MAX_VELOCITY;
	}
	
	int getTon(){
		return ton;
	}
	void setTon(int ton){
		this.ton = ton;
	}
	
	int getWeight(){
		return weight;
	}
	void setWeight(int weight){
		this.weight = weight;
	}
	
	void loadUp(int ton){
		weight++;
	}
	void loadDown(){}
	
	int getNowCapacity(){
		return ton;
	}
}

public class TruckMain {
	public static void main(String[] args){
		Truck myTruck = new Truck("Hyundai","Black",100,3,100,300);
		System.out.println("Car Name : " + myTruck.carName);
		System.out.println("Car Color : " + myTruck.color);
		System.out.println("Car Ton : " + myTruck.ton);
	}
}
