package task2;

import java.util.Arrays;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter testcases: ");
		int t = sc.nextInt();

		while (t-- > 0) {
			System.out.println("enter array size: ");
			int arrsize = sc.nextInt();
			System.out.println("enter sub set size: ");
			int subsize = sc.nextInt();
			System.out.println("enter times element should be poped: ");
			int pop = sc.nextInt();
			System.out.println("enter array elements: ");
			int[] arr = new int[arrsize];
			for (int i = 0; i < arrsize; i++) {
				arr[i] = sc.nextInt();

			}
			Arrays.sort(arr);
			int[] resarr = new int[arrsize];
			int[] resarr1 = new int[pop];
			int[] es = new int[pop];
			int os,c=0,res=0;
			for (int i = 0; i < arrsize; i++) {
				for (int j = i + 1; j < arrsize; j++) {
					//System.out.println("[" + arr[i] + "," + arr[j] + "]");
					//{1,2}    {1,4}    {1,5}    {2,4}    {2,5}    {4,5}  
					c++;
					if(c<=pop){
						resarr[i]=arr[i];
						resarr[j]=arr[j];
						es[i] =resarr[i]+resarr[j];
					
						System.out.println("[" + resarr[i] + "," + resarr[j] + "]"+" "+es[i]+" ");
						
					}		
				}
			}
			
			
		}
	}

}
