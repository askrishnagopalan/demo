package number_programming;

import java.util.Scanner;

public class NumberOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the digit:");
	int a=sc.nextInt();
	int count=0;
	while(a>0) {
		a=a/10;
         count++;
	}
	System.out.println("the number of digits:"+count);
	sc.close();
}
}
