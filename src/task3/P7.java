package task3;

public class P7 {
	public static void main(String[] args) {
		int rows, cols, countOdd = 0, countEven = 0;
		int a[][] = { { 2, 1, 9 }, { 6, 9, 7 }, { 4, 1, 6 } };
		rows = a.length;
		cols = a[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] % 2 == 0)
					countEven++;
				else
					countOdd++;
			}
		}

		System.out.println("Frequency of odd numbers: " + countOdd);
		System.out.println("Frequency of even numbers: " + countEven);
	}
}
