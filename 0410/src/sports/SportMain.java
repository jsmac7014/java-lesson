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
		System.out.println("����Ģ�� �ش� Ŭ�������� �ۼ��Ѵ�");
	}
}
class Baseball extends Sports{
	Baseball(String name, int player) {
		super(name, player);
	}
	void rule(){
		super.rule();
		System.out.println("�߱��� ����Ģ\n");
	}
}
class Basketball extends Sports{
	Basketball(String name, int player) {
		super(name, player);
	}
	void rule(){
		System.out.println("���� ����Ģ\n");
	}
	
}

public class SportMain {
	public static void main(String[] args){
		Baseball base = new Baseball("�߱�",9);
		Basketball basket = new Basketball("��",5);
		
		System.out.println("������� : " + base.name + "\n" + "�����ο� : " + base.player);
		base.rule();
		
		System.out.println("������� : " + basket.name + "\n" + "�����ο� : " + basket.player);
		basket.rule();
	}
}
