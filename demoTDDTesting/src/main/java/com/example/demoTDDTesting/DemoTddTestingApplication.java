package com.example.demoTDDTesting;

import testing.Game;
import testing.Player;

public class DemoTddTestingApplication {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.setPlayerName("Cooper");
		
		Game g1 = new Game();
		g1.add(p1);
		
		
		System.out.println(g1.getPlayerList());
		g1.getWinner();
	}

}
