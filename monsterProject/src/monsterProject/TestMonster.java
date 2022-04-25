package monsterProject;

public class TestMonster {

	public static void main(String[] args) {

		Monster m1 = new FireMonster("Phoenix");
		Monster m2 = new WaterMonster("Wave");
		Monster m3 = new StoneMonster("Boulder");

		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());

		m1 = new StoneMonster("Rocky");
		System.out.println(m1.attack());

		Monster m4 = new Monster("Monster");
		System.out.println(m4.attack());
	}
}