package testing;

public class Player {
// 	FIELD
	private String playerName;

	public Player() {
	}

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
//	EXTRA METHODS 
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}
	
	

}
