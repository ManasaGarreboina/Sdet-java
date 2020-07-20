package task1;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		reverseArray(arr, arr.length);
	}

	static void reverseArray(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		System.out.print("Array Reversed :");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k]+" ");
		}
	}

}
