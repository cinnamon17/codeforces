import java.util.Scanner;

public class StonesOnTheTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer nStones = Integer.valueOf(scanner.nextLine());
		String stones = scanner.nextLine();
		Integer counter = 0;

		for (int i = 0; i < nStones - 1; i++) {

			if (stones.charAt(i) == stones.charAt(i + 1)) {
				counter++;
			}
		}
		scanner.close();

		System.out.println(counter);
	}
}
