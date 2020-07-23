package task3;

import java.util.Scanner;

public class P8 {
	static void transpose(int A[][], int B[][], int rows, int columns) {
		int i, j;
		for (i = 0; i < columns; i++)
			for (j = 0; j < rows; j++)
				B[i][j] = A[j][i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ROWS: ");
		final int rows = sc.nextInt();
		System.out.println("COLUMNS: ");
		final int columns = sc.nextInt();
		System.out.println("FirstMatrix: ");
		int A[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int B[][] = new int[columns][rows], i, j;

		transpose(A, B, rows, columns);

		System.out.println("Result matrix is");
		for (i = 0; i < columns; i++) {
			for (j = 0; j < rows; j++)
				System.out.print(B[i][j] + " ");
			System.out.println(" ");
		}
		sc.close();
	}
}
