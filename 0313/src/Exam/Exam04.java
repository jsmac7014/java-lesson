package Exam;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int count = 0;
		while(num++<100){
			if(num%5!=0){
				continue;
			}
			else if(num%7!=0){
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("Count : " + count);
	}

}
