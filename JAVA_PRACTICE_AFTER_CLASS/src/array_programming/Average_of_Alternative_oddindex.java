package array_programming;

import java.util.Scanner;

public class Average_of_Alternative_oddindex {
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
		int Average=0,count=0,sum=0;
		for(int i=1;i<a.length;i=i+4) {
			sum=sum+a[i];
			count++;
		}
		Average=(sum/count);
		System.out.println("The average of alternative odd index of an array:"+Average);
		sc.close();
	}
}
