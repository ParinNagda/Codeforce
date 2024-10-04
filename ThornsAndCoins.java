import java.util.ArrayList;
import java.util.Scanner;

public class ThornsAndCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberOfTestCase = sc.nextInt();

		for (int i = 0; i < numberOfTestCase; i++) {
			int pathLength = sc.nextInt();
			int count = 0;
			ArrayList<Integer> thorns = new ArrayList();
			var val = sc.next();
			int j = 0;
			for (char pathVal : val.toCharArray()) {
				if (pathVal == '@') {
					count++;
				}
				if (pathVal == '*') {
					thorns.add(j);
					if (thorns.contains(j - 1)) {
						break;
					}
				}
				j++;
			}


			System.out.println(count);

		}

	}
}
