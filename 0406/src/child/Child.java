package child;
class Parent{
//	Parent(){
//		System.out.println("1");
//	}
	Parent(int a){
		System.out.println("2");
	}
}
public class Child extends Parent {
	Child(){
//		super();
		super(2);
		System.out.println("child31");
	}
	public static void main(String[] args){
		Child child3 = new Child();
	}
}
