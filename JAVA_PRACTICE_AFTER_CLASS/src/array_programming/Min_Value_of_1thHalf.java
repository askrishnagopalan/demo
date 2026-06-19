package array_programming;

import java.util.Scanner;

public class Min_Value_of_1thHalf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n =sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter the values of array"+i+": ");
			int j=sc.nextInt();
			a[i]=j;
		}
		int Min=a[0];
		int half=(a.length/2);
		for(int i=0;i<half;i++) {
			if(a[0]>a[i]) 
			{Min=a[i];}
		}
		System.out.println("The Miniimum value of 1th half of array: "+Min);
		sc.close();
	}
}
