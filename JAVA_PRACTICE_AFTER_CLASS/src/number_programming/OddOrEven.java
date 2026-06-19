package number_programming;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int b= sc.nextInt();
	if(b%2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
	sc.close();
}
}
