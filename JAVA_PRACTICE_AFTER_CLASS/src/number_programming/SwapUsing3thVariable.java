package number_programming;

import java.util.Scanner;

public class SwapUsing3thVariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of first number:");
	int c= sc.nextInt();
	System.out.print("Enter the value of second number:");
	int d= sc.nextInt();
	System.out.println("Before swap");
	System.out.println("first number:"+c);
	System.out.println("second number:"+d);
	int e=c;
	c=d;
	d=e;
	System.out.println("after swap");
	System.out.println("first number:"+c);
	System.out.println("second number:"+d);
	sc.close();
}
}
