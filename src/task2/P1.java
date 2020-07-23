package task2;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, columns;
		Scanner sc = new Scanner(System.in);
		System.out.println("ROWS: ");
		rows = sc.nextInt();
		System.out.println("COLUMNS: ");
		columns = sc.nextInt();
		int[][] firstMatrix = new int[rows][columns];
		int[][] secondMatrix = new int[rows][columns];
		System.out.println("FirstMatrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("SecondMatrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				secondMatrix[i][j] = sc.nextInt();
			}
		}

		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}

		System.out.println("Sum of two matrices is: ");
		for (int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
		sc.close();
	}

}
