package testing;

import java.util.ArrayList;

public class Game {

	private String player;

	ArrayList<Player> playerList = new ArrayList<>();

	public Game() {
	}

	public Game(String player) {
		this.player = player;
	}

	public String getPlayer() {
		return player;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}

// 	EXTRA CLASS METHODS

	public boolean add(Player player) {
		playerList.add(player);
		return true;
	}

	public void getWinner() {
		System.out.println("Winner");
	}

	@Override
	public String toString() {
		return "Game [player=" + player + ", playerList=" + playerList + "]";
	}

}
