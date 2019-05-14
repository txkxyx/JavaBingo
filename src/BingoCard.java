import java.util.ArrayList;
import java.util.Collections;

public class BingoCard {
	private String playerName;
	private int[][] numbers = new int[5][5];

	public BingoCard(String playerName) {
		this.playerName = playerName;
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			numberList.add(i);
		}
		Collections.shuffle(numberList);
		int index = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = numberList.get(index);
				index++;
			}
		}
		numbers[2][2] = 0;
	}

	public void showCard() {
		System.out.printf("*-%s-*\n", playerName);
		System.out.println(" | 1| 2| 3| 4| 5|");
		System.out.println("------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d|", i);
			for (int j = 0; j < 5; j++) {
				if (numbers[i][j] == 0) {
					System.out.printf("%2s|", "●");
				} else {
					System.out.printf("%2d|", numbers[i][j]);
				}
			}
			System.out.println();
		}
	}

	public boolean checkNumber(int number) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (numbers[i][j] == number) {
					numbers[i][j] = 0;
					System.out.println("Hit");
					showCard();
				}
			}
		}
		return checkBingo();
	}

	private boolean checkBingo() {
		if (checkVertical()) {
			System.out.println("Bingo");
			return true;
		}
		if (checkHorizontal()) {
			System.out.println("Bingo");
			return true;
		}
		if (checkLeftCross()) {
			System.out.println("Bingo");
			return true;
		}
		if (checkRightCross()) {
			System.out.println("Bingo");
			return true;
		}
		return false;
	}

	private boolean checkVertical() {
		for (int i = 0; i < 5; i++) {
			int count = 0;
			for (int j = 0; j < 5; j++) {
				if (numbers[j][i] == 0) {
					count++;
				}
			}
			if (count == 5) {
				return true;
			}
		}
		return false;

	}

	private boolean checkHorizontal() {
		for (int i = 0; i < 5; i++) {
			int count = 0;
			for (int j = 0; j < 5; j++) {
				if (numbers[i][j] == 0) {
					count++;
				}
			}
			if (count == 5) {
				return true;
			}
		}
		return false;
	}

	private boolean checkLeftCross() {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (numbers[i][4 - i] == 1) {
				count++;
			}
		}
		if (count == 5) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkRightCross() {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (numbers[i][4 - i] == 1) {
				count++;
			}
		}
		if (count == 5) {
			return true;
		} else {
			return false;
		}

	}

}
