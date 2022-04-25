package monsterProject;

public class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return name + " Attacks with fire!";
	}
}
