package gameXOv3;

public class BotPlayer extends Player {
	
	public static final String DEF_NAME_OF_PLAYER = "Computer";
	
	public final String nameOfPlayer;
	
	public final byte sideOfGame;

	public BotPlayer () {
		this(DEF_NAME_OF_PLAYER, DEF_SIDE_OF_GAME);
	}
	
	public BotPlayer (byte sideOfGame) {
		this(DEF_NAME_OF_PLAYER, sideOfGame);
	}
	
	public BotPlayer (String nameOfBot, byte sideOfGame) {
		this.nameOfPlayer = nameOfBot;
		this.sideOfGame = sideOfGame;
	}

}
