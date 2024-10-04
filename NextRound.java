import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		var noOfContestant = sc.nextInt();
		var cutoff = sc.nextInt();
		var count = 0;
		var cutOffMark = 0;
		for (int i = 1; i < noOfContestant + 1; i++) {
			var mark = sc.nextInt();
			if (i == cutoff) {
				cutOffMark = mark;
			}
			if (mark >= cutOffMark && mark != 0) {
//				System.out.println("mark " + mark + " cutoff " + cutOffMark);
				count += 1;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
