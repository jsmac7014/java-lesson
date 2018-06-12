class Student {
	String name;
	int score;
	
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	boolean equals(Student s){
		return s.score == this.score && s.name == this.name;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("JungWoo", 68);
		Student st2 = new Student("JungWoo", 68);
		Student st3 = st1;
		System.out.println(st1.equals(st2));
		System.out.println(st3.equals(st1));
	}

}
