package task2;

import java.util.Arrays;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = { 'M', 'A', 'N', 'A', 'S', 'A' };
		String st = String.valueOf(ch);
		System.out.println("Char to String: " + st);
		char[] chars = st.toCharArray();
		System.out.println("String to Char: " + Arrays.toString(chars));
	}
}
