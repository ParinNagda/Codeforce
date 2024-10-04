import java.util.ArrayList;
import java.util.Scanner;

public class QueueAtTheSchool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int time = sc.nextInt();

		String queue = sc.next();
		var queueArray = queue.toCharArray();
		for (int j = 0; j < time; j++) {

			ArrayList<Integer> indexes = new ArrayList();

			for (int i = 0; i < queueArray.length - 1; i++) {
				char temp = 'C';

				if (queueArray[i] == 'B' && queueArray[i + 1] == 'G' && !indexes.contains(i)) {
					temp = queueArray[i];
					queueArray[i] = queueArray[i + 1];
					queueArray[i + 1] = temp;
					indexes.add(i + 1);
				}
			}

		}
		System.out.println(queueArray);

	}



}
