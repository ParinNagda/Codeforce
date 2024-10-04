import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			var word = sc.next();
			if (word.length() > 10) {
				var charArray = word.toCharArray();
				var result = charArray[0] + Integer.toString(charArray.length - 2) + charArray[charArray.length - 1];
				System.out.println(result);

			} else {
				System.out.println(word);
			}

		}
	}

}
