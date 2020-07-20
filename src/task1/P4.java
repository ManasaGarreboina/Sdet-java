package task1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0, b = 0;
		if ( t >= 1 && t <= 100){
			while (t-- > 0) {
				a = sc.nextInt();
				b = sc.nextInt();
				if ((a>=1 && a <= 106) && ( b>=1 && b <= 106)){
					a = a + b;
					b = a - b;
					a = a - b;
					System.out.println(a + " " + b);
				}
			}
		}

	}

}
