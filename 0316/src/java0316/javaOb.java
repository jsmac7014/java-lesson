package java0316;


public class javaOb {
		public static void main(String[] args) {
			TV mytv = new TV();
			mytv.brand = "New brand";
			mytv.power();
			mytv.printBrand();
			mytv.channel = 11;
			mytv.channelDown();
			mytv.volUp(30);
			mytv.limitAge(25);	
		}
}
