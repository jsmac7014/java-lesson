package sports;

class Sports{
	String name;
	int player;
	Sports(String name, int player){
		this.name = name;
		this.player = player;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setPlayer(int player){
		this.player = player;
	}
	
	int getPlayer(){
		return player;
	}
	String getname(){
		return name;
	}
	void rule(){
		System.out.println("경기규칙은 해당 클래스에서 작성한다");
	}
}
class Baseball extends Sports{
	Baseball(String name, int player) {
		super(name, player);
	}
	void rule(){
		super.rule();
		System.out.println("야구의 경기규칙\n");
	}
}
class Basketball extends Sports{
	Basketball(String name, int player) {
		super(name, player);
	}
	void rule(){
		System.out.println("농구의 경기규칙\n");
	}
	
}

public class SportMain {
	public static void main(String[] args){
		Baseball base = new Baseball("야구",9);
		Basketball basket = new Basketball("농구",5);
		
		System.out.println("경기종목 : " + base.name + "\n" + "선수인원 : " + base.player);
		base.rule();
		
		System.out.println("경기종목 : " + basket.name + "\n" + "선수인원 : " + basket.player);
		basket.rule();
	}
}
