package main;

public class Test {
	public static void main(String args[]){
		String str1 = new String (" Java Programming ");
		String str2 = str1.trim();
		System.out.println("s1�� ���  : " + str1);
		System.out.println("s1�� ���� : " + str1.length());
		System.out.println("s1���� ������ �����Ͽ� s2�� ���� : " + str2);
		System.out.println("s1�� ����  :" + str2.length());
		System.out.println("s2���� ���� o�� ��ġ : " + str2.indexOf('o'));
		System.out.println("s2���� ���� a�� A�� ��ȯ : " + str2.replace('a', 'A'));
		System.out.println("s2���� ���� Java�� C++�� ��ȯ : " + str2.replace("Java", "C++"));
		System.out.println("s2���� Program �ܾ� ���� ���� : " + str2.contains("Program"));
		System.out.println("s2���� 0~4������ ������� :" + str2.substring(0,5));
		System.out.println("s2���� ��� �빮�ڷ� ��ȯ :" + str2.toUpperCase());
		System.out.println("s2�� ��� :" + str2);
		
	}
}
