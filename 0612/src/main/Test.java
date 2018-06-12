package main;

public class Test {
	public static void main(String args[]){
		String str1 = new String (" Java Programming ");
		String str2 = str1.trim();
		System.out.println("s1의 출력  : " + str1);
		System.out.println("s1의 길이 : " + str1.length());
		System.out.println("s1에서 공뱅을 제거하여 s2에 대입 : " + str2);
		System.out.println("s1의 길이  :" + str2.length());
		System.out.println("s2에서 문자 o의 위치 : " + str2.indexOf('o'));
		System.out.println("s2에서 문자 a를 A로 변환 : " + str2.replace('a', 'A'));
		System.out.println("s2에서 문자 Java를 C++로 변환 : " + str2.replace("Java", "C++"));
		System.out.println("s2에서 Program 단어 포함 여부 : " + str2.contains("Program"));
		System.out.println("s2에서 0~4번까지 문자출력 :" + str2.substring(0,5));
		System.out.println("s2에서 모두 대문자로 변환 :" + str2.toUpperCase());
		System.out.println("s2의 출력 :" + str2);
		
	}
}
