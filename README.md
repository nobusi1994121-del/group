# group
public class Hero extends Character{
	
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
