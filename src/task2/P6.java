package task2;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string :");
		String str = sc.nextLine();
		str = str.replaceAll("\\s", "");

		System.out.println(str);

	}

}
