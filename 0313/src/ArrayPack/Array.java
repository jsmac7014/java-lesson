package ArrayPack;

public class Array {

	public static void main(String[] args) {

		int numArray[] = new int[]{9,4,3,8,2};
		int sum=0,odd=0,even=0;
		
		for(int i=numArray.length-1; i>=0; i--){
			System.out.println(numArray[i]);
			sum += numArray[i];
			if(numArray[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		
		System.out.println("���� : " + sum);
		System.out.println("Ȧ�� ���� : " + odd);
		System.out.println("¦�� ���� : " + even);
		
	}


}
