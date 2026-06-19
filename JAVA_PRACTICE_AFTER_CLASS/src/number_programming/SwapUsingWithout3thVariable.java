package number_programming;

import java.util.Scanner;

public class SwapUsingWithout3thVariable {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of first number:");
		int f= sc.nextInt();
		System.out.print("Enter the value of second number:");
		int g= sc.nextInt();
		System.out.println("Before swap");
		System.out.println("first number:"+f);
		System.out.println("second number:"+g);
		f=f+g;//f+=g;
		g=f-g;//g=f-g;
		f=f-g;//f=f-g;
		System.out.println("After swap");
		System.out.println("first number:"+f);
		System.out.println("second number:"+g);
		sc.close();
	}
}
