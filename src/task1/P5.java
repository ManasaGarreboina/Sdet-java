package task1;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter testcases: ");
		int t = sc.nextInt();
		if (t >= 1 && t <= 100) {
			while (t-- > 0) {
				System.out.println("enter number: ");
				int n = sc.nextInt();
				if (n > 0 && n <= 1018)
					if (isPowerOfTwo(n)) {
						System.out.println("YES" + " ");
					} else {
						System.out.println("NO" + " ");
					}
			}
		}
		sc.close();
	}

	static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

}
