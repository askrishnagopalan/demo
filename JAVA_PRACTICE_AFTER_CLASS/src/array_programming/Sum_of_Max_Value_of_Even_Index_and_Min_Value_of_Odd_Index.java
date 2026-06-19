package array_programming;

import java.util.Scanner;

public class Sum_of_Max_Value_of_Even_Index_and_Min_Value_of_Odd_Index {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of array:");
	int n =sc.nextInt();
	int[] a=new int[n];
	int result;
	for(int i=0;i<a.length;i++) {
		System.out.print("Enter the values of array"+i+": ");
		int j=sc.nextInt();
		a[i]=j;
	}
	int max=a[0],min=a[0];
	for(int i=0;i<a.length;i++) 
	{
		if(i%2==0) {
			if(max<a[i]) {
				max=a[i];
			}}
		if(i%2!=0){
			if(min>a[i]) {
				min=a[i];
			}}
		}
	result=max+min;
		System.out.println("The values sum of maximum value of even index and minimum value of odd index in array: "+result);
		sc.close();
}
}
