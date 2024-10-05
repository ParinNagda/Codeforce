import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var username = sc.next();
		ArrayList<Character> distinctVal = new ArrayList();
		for (char value : username.toCharArray()) {
			if (!distinctVal.contains(value)) {
				distinctVal.add(value);
			}
		}

		if (((distinctVal.size() - 1) % 2) == 0) {
			System.out.println("IGNORE HIM!");
		} else {
			System.out.println("CHAT WITH HER!");
		}

		sc.close();

	}

}
