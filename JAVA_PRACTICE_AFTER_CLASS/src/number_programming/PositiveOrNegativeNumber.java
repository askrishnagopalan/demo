package number_programming;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the integer:");
	int a = sc.nextInt();
	if(a>0) {
		System.out.println("Positive integer");
	}
	else if(a<0) {
		System.out.println("Negative integer");}
		else
		{
			System.out.println("0 is neither positive nor negative");
		}
	sc.close();
	}
}

