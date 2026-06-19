package number_programming;

import java.util.Scanner;

public class FindReminder {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the digit to find the last digit of the given number:");
	int a = sc.nextInt();
	int reminder= a%10;
	System.out.println("The last digit is:"+reminder);
	int nolastdigit= a/10;
	System.out.println("removed last digit:"+nolastdigit);
	sc.close();
	
	
}
}
