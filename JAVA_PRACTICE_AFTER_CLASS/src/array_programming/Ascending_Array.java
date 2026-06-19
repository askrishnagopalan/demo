package array_programming;

import java.util.Scanner;

public class Ascending_Array {
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
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
		}
		}
		System.out.println();
		System.out.print("The values of Ascending order array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
