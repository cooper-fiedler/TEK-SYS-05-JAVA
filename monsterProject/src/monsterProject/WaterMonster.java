package monsterProject;

public class WaterMonster extends Monster {

	public WaterMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return name + " Attacks with water!";
	}
}