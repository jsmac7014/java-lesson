package the20415;

class Student{
	public String name;
	public int class_num;
	public String school = "sunrin";
	public int sunrin_num=11321;
	public Student(String n, int num){
		name=n;
		class_num = num;
		System.out.println(this.school +"(�б���ȣ :" + this.sunrin_num + ") "  + this.name + "�� " + this.class_num+"�� �Դϴ�");
	}

}

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ksr = new Student("�輱��",1);
		Student swk = new Student("�ۿ���",2);
		Student kyi = new Student("�迵��",3);
		
	}

}
