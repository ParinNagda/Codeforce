import java.util.Scanner;

public class VanyaAndCubes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfCubes = sc.nextInt();
		if (numberOfCubes == 1) {
			System.out.println(1);
			return;
		}
		int i = 1;
		int thisRound = 0;
		while (numberOfCubes > 0) {
			thisRound = thisRound + i;
			numberOfCubes = numberOfCubes - thisRound;
			if (numberOfCubes >= 0) {
				i++;
			} else {
				break;
			}
		}

		System.out.println(i - 1);

	}
	
}
