package pattern_programming;

import java.util.Scanner;

public class Qspider_chrompet {
	public static void main (String[] args) throws InterruptedException
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the \"N\" value for display size:");
	int n= sc.nextInt();
	System.out.println();
	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++) //Q
		{
			if(i==0&&(j!=0&&j!=n-1)||j==0&&i!=0&&i!=n-2&&i!=n-1||i==n-2&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-2||i>=n/2 && i-j==0)
				{System.out.print("\u001B[33m *\u001B[0m");
				}
			else
				System.out.print("  ");
		}
	System.out.print("  ");
		for(int j=0;j<n;j++) //S
		{
			if(i==0||j==0&&i<n/2||i==n/2||j==n-1&&i>n/2||i==n-1)
				{System.out.print(" *");
				}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		for(int j=0;j<n;j++) //P
		{
			if(i==0||j==0||i==n/2||j==n-1 && i<=(n/2))
				{System.out.print(" *");
				}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		for(int j=0;j<n;j++) //I
		{
			if(i==0||j==(n/2)||i==n-1)
				{System.out.print(" *");
				//Thread.sleep(1000);
				}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		for(int j=0;j<n;j++) //D
		{
			if(j==0||(i==0 && j!=n-1)||(i==n-1&& j!=n-1)||(j==n - 1&&(i!=0&&i!= n-1)))
				{System.out.print(" *");
				}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		for(int j=0;j<n;j++) //E
		{
			if(j==0 || i==0||i==(n/2)||i==n-1)
				{System.out.print("* ");
				}
			else
				System.out.print("  ");
		}
		System.out.print("  ");
		for(int j=0;j<n;j++) //R
		{
			if(i==0||j==0||i==n/2||j==n-1 && i<=(n/2)||i>=(n/2)&&i-j==0)
				{System.out.print(" *");
				}
			else
				System.out.print("  ");	
		}

		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++) 
		{
			System.out.print(" ");
		}
		for(int j=0;j<n;j++) //C
		{
			if(i==0 && j!=0|| i==n-1 && j!=0|| j==0 && i!=0 && i!=n-1)
				{System.out.print(" *");
				//Thread.sleep(1000);
				}
			else
				System.out.print("  ");
		}
			System.out.print("  ");
			for(int j=0;j<n;j++) //H
			{
				if(j==0||i==(n/2)||j==n-1)
					{System.out.print(" *");
					}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //R
			{
				if(i==0||j==0||i==n/2||j==n-1 && i<=(n/2)||i>=(n/2)&&i-j==0)
					{System.out.print(" *");
					}
				else
					System.out.print("  ");	
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //O
			{
				if(i==0&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-1)
					{System.out.print(" *");
					/*Thread.sleep(1000);*/}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //M
			{
				if(j==0||j==n-1||i==j&&j<=(n/2)||i+j==n-1 && i<=(n/2))
					{System.out.print(" *");
					}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //P
			{
				if(i==0||j==0||i==n/2||j==n-1 && i<=(n/2))
					{System.out.print(" *");
					}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //E
			{
				if(j==0 || i==0||i==(n/2)||i==n-1)
					{System.out.print("* ");
					}
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j=0;j<n;j++) //T
			{
				if(i==0||j==(n/2)) {
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
		System.out.println();
	}
	sc.close();
}
}
