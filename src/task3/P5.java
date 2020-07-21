package task3;

public class P5 {
	public static void main(String[] args) {
		int rows, cols;
		int a[][] = { { 2, 2, 5 }, { 9, 5, 4 }, { 1, 8, 9} };
		rows = a.length;
		cols = a[0].length;
		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			System.out.println("Lower triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (j > i)
						System.out.print("* ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
