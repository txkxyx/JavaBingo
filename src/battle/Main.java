package battle;

import bingo.Drawer;

public class Main {
	public static void main(String[] args) {
		BingoCard[] bingoCardList = { new BingoCard("A"), new BingoCard("B"), new BingoCard("C"), };
		Drawer drawer = new Drawer();

		BingoBattle battle = new BingoBattle(bingoCardList, drawer);
		battle.gameStart();
		battle.gameFinish();
	}
}
