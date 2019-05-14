import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BingoCard okamoto = new BingoCard("Okamoto");
		okamoto.showCard();

		Drawer drawer = new Drawer();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("next > ");
			String input = scanner.nextLine();
			boolean bol = okamoto.checkNumber(drawer.drawNumber());
			if (bol) {
				break;
			}
		}

		// for (int i = 0; i < 100; i++) {
		// int number = drawer.drawNumber();
		// boolean bol = okamoto.checkNumber(number);
		// if (bol) {
		// break;
		// }
		// }

		okamoto.showCard();

	}
}
