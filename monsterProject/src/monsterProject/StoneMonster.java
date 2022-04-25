package monsterProject;

public class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return name + " Attacks with stones!";
	}
}