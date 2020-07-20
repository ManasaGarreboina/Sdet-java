package task1;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if (t >= 1 && t <= 100) {
			while (t-- > 0) {
				int n = sc.nextInt();
				if (n > 0 && n <= 1018)
					if (isPowerOfTwo(n)) {
						System.out.print("YES"+" ");
					} else {
						System.out.print("NO"+" ");
					}
			}
		}
	}

	static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
	}

}
