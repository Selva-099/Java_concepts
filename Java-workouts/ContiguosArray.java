package workouts;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ContiguosArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();

			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				int first = deque.removeFirst();
				max = Math.max(set.size(), max);
				if (!deque.contains(first))
					set.remove(first);
			}

		}
		System.out.println(max);

	}

}
