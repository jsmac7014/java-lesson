package the20415;

class Student{
	public String name;
	public int class_num;
	public String school = "sunrin";
	public int sunrin_num=11321;
	public Student(String n, int num){
		name=n;
		class_num = num;
		System.out.println(this.school +"(학교번호 :" + this.sunrin_num + ") "  + this.name + "은 " + this.class_num+"반 입니다");
	}

}

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ksr = new Student("김선린",1);
		Student swk = new Student("송원근",2);
		Student kyi = new Student("김영일",3);
		
	}

}
