package array_programming;

import java.util.Scanner;

public class Min_Value_of_2thHalf {
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
		int half=(a.length/2);
		int Min=a[half];
		for(int i=half;i<a.length;i++) {
			if(Min>a[i]) 
			{Min=a[i];}
		}
		System.out.println("The Maximum value of 2th half of array: "+Min);
		sc.close();
	}
}
