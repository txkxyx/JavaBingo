package bingo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class Drawer {
	private Queue<Integer> numberList = new ArrayDeque();

	public Drawer() {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);

		numberList.addAll(numbers);
	}

	public int drawNumber() {
		int number = numberList.poll();
		System.out.println("Draw:" + number);
		return number;
	}

}
