package array_programming;

import java.util.Scanner;

public class Reverse_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of array:");
	int n =sc.nextInt();
	int[] a=new int[n];
	int[] result=new int[n];
	for(int i=0;i<a.length;i++) {
		System.out.print("Enter the values of array"+i+": ");
		//System.out.println();
		int j=sc.nextInt();
		a[i]=j;
	}
	for(int i=0;i<a.length;i++) {
		result[n-1]=a[i];
		n--;
	}
	for(int i=0;i<result.length;i++) {
		System.out.println("The values of reversed array"+i+": "+result[i]);
	}
	sc.close();
}
}
