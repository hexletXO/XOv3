package gameXOv3;

public class Game {
	
	public static final byte DEF_TYPE_OF_GAME = 1;
	
	public final byte typeOfGame;
	
	public static Player player1, player2;
	
	public final byte whoMoveFirst;
	
	public Game () {
		this(player1, player2, getRandomVuln(), Dialog.getFromConsoleInputType((byte) 1, (byte) 2));
	}
	
	public Game (Player player1, Player player2, byte whoMoveFirst, byte typeOfGame) {
		Game.player1 = new Player((byte) 1);
		if (typeOfGame == 1) {
			Game.player2 = new Player((byte) -1);
		}
		if (typeOfGame == 2) {
			Game.player2 = new BotPlayer((byte) -1);
		}
		this.whoMoveFirst = whoMoveFirst;
		this.typeOfGame = typeOfGame;
	}

	public String getNameWhoMoveFirst() {
		if (player1.getSideOfGame() == whoMoveFirst) {
			return player1.getPlayerName();
		} else {
			return player2.getPlayerName();
		}
 	}
	
	public static byte getRandomVuln() {
		byte vuln = (byte) ((Math.random() * (2)));
		if (vuln == 0) vuln = -1;
		return vuln;		
	}
	
}
