package java0316;

public class TV {
	final int MAX_CHANNEL = 250;
	boolean power;
	int channel;
	String brand = "Sunrin";
	String color = "Metal black";
	
	void power(){
		power = !power;
		if(power) System.out.println("TV on");
		else System.out.println("TV off");
	}
	
	void printBrand(){
		System.out.println("Brand is " + brand);
	}
	
	void volUp(int vol){
		System.out.println("Vol : " + vol);
	}
	void channelDown(){
		System.out.println("channel : " + --channel);
	}
	
	void limitAge(int ageLimit){
		if(ageLimit < 19){
			System.out.println("This Channel is for over 19");
		}
		else{
			System.out.println("You are " + ageLimit + ". You can watch it");
		}
	}
}
