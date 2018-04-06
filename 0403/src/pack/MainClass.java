package pack;
class Student{
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	
	public Student(){}
	public Student(String name, String hakbun){
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study(){
		System.out.println("공부하다");
	}
	public void eat(){
		System.out.println("먹다");
	}
	public void test(){
		System.out.println("시험");
	}
	public void extra_act(){
		System.out.println("동아리");
	}
	
}
class Leader extends Student{
	boolean leader;
	public Leader(String name,String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
	}
	public void isLeader(){
		if(leader){
			System.out.println(this.name +"은 학급회장이다");
		}
		else{
			System.out.println(this.name +"은 학급회장이 아니다");
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader hong = new Leader("홍길동","30130",false);
		hong.isLeader();
	}

}
