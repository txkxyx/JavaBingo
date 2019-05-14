package battle;

import java.util.Scanner;

import bingo.Drawer;

public class BingoBattle {

	private BingoCard[] bingoCardList;
	private int members;
	private Drawer drawer;

	public BingoBattle(BingoCard[] bingoCardList, Drawer drawer) {
		this.bingoCardList = bingoCardList;
		this.members = bingoCardList.length;
		this.drawer = drawer;
	}

	public void gameStart() {
		for (int i = 0; i < bingoCardList.length; i++) {
			bingoCardList[i].showCard();
		}

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("next > ");
			String input = scanner.nextLine();
			int number = drawer.drawNumber();
			for (int i = 0; i < bingoCardList.length; i++) {
				boolean bol = bingoCardList[i].checkNumber(number);
				if (bol) {
					System.out.printf("%sさん%d位です。", bingoCardList[i].getPlayerName(), 1);
					return;
				}
			}
		}
	}

	public void gameFinish() {
		for (int i = 0; i < bingoCardList.length; i++) {
			bingoCardList[i].showCard();
		}
	}

}
