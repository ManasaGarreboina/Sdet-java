package task1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string :");
		String input = sc.nextLine();
		char[] res = input.toCharArray();

		for (int i = res.length - 1; i >= 0; i--)
			System.out.print(res[i]);
		sc.close();

	}

}
