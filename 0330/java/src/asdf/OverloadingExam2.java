package asdf;

public class OverloadingExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input  = new java.util.Scanner(System.in);
		Overloading a = new Overloading();
		a.say();
		a.say("How are you");
		a.say("I am fine",input.nextInt());
	}

}

class Overloading{
	public void say(){
		System.out.println("Hello");
	}
	public void say(String s){
		System.out.println(s);
	}
	public void say (String s, int a){
		for(int i=0;i<a;i++)
			System.out.println(s);
	}
}