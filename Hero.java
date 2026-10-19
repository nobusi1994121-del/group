# group
public class Hero{
	
	public Hero() {
		this("ミナト",100);
	}
	public Hero(String name, int hp) {
		super(name,hp);
	}
	
	public void attack(Matango m) {
		System.out.println(this.getName() + "の攻撃！");
		m.setHp(m.getHp() - 10);
		System.out.println("10ポイントのダメージをあたえた！");
	}
	public void run() {
		System.out.println(this.getName() + "は逃げ出した！");
	}
}


class Matango {
	int hp = 50;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}

abstract class Character {
	String name;
	int hp;

	public void run () {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "は逃げ出した");
	}
	public void attack (Matongo m) {
			System.out.println(this.name + "の攻撃！");
			System.out.println("敵に??ポイントのダメージを与えた！");
	}

}
