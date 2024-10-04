import java.util.Scanner;

public class Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfProblem = sc.nextInt();
		var result = 0;
		for (int i = 0; i < noOfProblem; i++) {
			var A = sc.nextInt();
			var B = sc.nextInt();
			var C = sc.nextInt();
			if (A + B + C >= 2) {
				result++;
			}
		}

		System.out.println(result);
		sc.close();
	}

}
