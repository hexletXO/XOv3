package gameXOv3;

import java.util.Scanner;

public class Dialog {
	
	private static final String QST_FOR_NAME			= 	"\nVvedite imya igroka:";
	
	private static final String MSG_INVALID_VULN		= 	"\nNe vhodit v dostupni promezhutok znacheni";
	
	private static final String MSG_INVALID_TYPE_VULN 	= 	"\nNe podhodit po tipu";
	
	private static final String QST_FOR_TYPE_GAME 		= 	"\nViberite rezhim: 1. Person vs Person 2. Person vs Computer.";
	
	private static Scanner scanner;
	
	public static String getNameOfPlayer() {
		scanner = new Scanner(System.in);
		System.out.println(QST_FOR_NAME);
		String nameOfPlayer = scanner.next();
		return nameOfPlayer;
	} 
	
	public static byte getFromConsoleInputType(byte minTypeOfGame, byte maxTypeOfGame) {
		return getVulnFromConsole(minTypeOfGame, maxTypeOfGame, QST_FOR_TYPE_GAME);
	}
	
	public static byte getVulnFromConsole(byte minVuln, byte maxVuln, String msg) {
		scanner = new Scanner(System.in);
		byte getVuln;
		System.out.println(msg);
		if (scanner.hasNextByte()) {
			getVuln = scanner.nextByte();
			if ((getVuln >= minVuln) && (getVuln <= maxVuln)) {
				return getVuln;
			} else {
				System.out.println(MSG_INVALID_VULN);
			}
		} else {
			System.out.println(MSG_INVALID_TYPE_VULN);
		}
		return getVulnFromConsole(minVuln, maxVuln, msg);
	}

}
