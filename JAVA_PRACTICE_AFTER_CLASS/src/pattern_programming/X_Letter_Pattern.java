package pattern_programming;

import java.util.Scanner;

public class X_Letter_Pattern {
	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the \"N\" value for display size:");
		int n= sc.nextInt();
		System.out.println();
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i+j==n-1||i==j) {
					System.out.print(" *");
					Thread.sleep(1000);
				}
				else
					System.out.print("  ");	
			}
			System.out.println();
		}
		sc.close();
	}
}
