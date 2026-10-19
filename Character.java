package code11_08;

import code11_01.Matongo;

public abstract class Character {
	String name;
	int hp;

	public void run () {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "は逃げ出した");
	}
	public void attack (Matongo m) {
			System.out.println(this.name + "の攻撃！");
			System.out.println("敵に??ポイントのダメージを与えたyo！");
	}

}
