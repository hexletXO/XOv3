package gameXOv3;

public class Player {
	
	public static final byte DEF_SIDE_OF_GAME = 1;
	
	public static final String DEF_NAME_OF_PLAYER = "Player";
	
	public final String nameOfPlayer;
	
	public final byte sideOfGame;
	
	public Player () {
		this(Dialog.getNameOfPlayer(), DEF_SIDE_OF_GAME);
	}
	
	public Player (byte sideOfGame) {
		this(Dialog.getNameOfPlayer(), sideOfGame);
	}
	
	public Player (String nameOfPlayer, byte sideOfGame) {
		this.nameOfPlayer = nameOfPlayer;
		this.sideOfGame = sideOfGame;
	}
	
	public String getPlayerName () {
		return nameOfPlayer;
	}
	
	public byte getSideOfGame () {
		return sideOfGame;
	}

}
