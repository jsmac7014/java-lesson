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
		System.out.println("�����ϴ�");
	}
	public void eat(){
		System.out.println("�Դ�");
	}
	public void test(){
		System.out.println("����");
	}
	public void extra_act(){
		System.out.println("���Ƹ�");
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
			System.out.println(this.name +"�� �б�ȸ���̴�");
		}
		else{
			System.out.println(this.name +"�� �б�ȸ���� �ƴϴ�");
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader hong = new Leader("ȫ�浿","30130",false);
		hong.isLeader();
	}

}
