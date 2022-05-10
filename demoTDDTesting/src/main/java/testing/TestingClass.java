package testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class TestingClass {

	@Test
	public void testGame() {

		Player p1 = new Player();
		p1.setPlayerName("Bob");
		String expectedName = "Bob";

		Game g1 = new Game();
		g1.add(p1);

		String actualName = p1.getPlayerName();

		Assert.assertEquals(expectedName, actualName);
	}

}
