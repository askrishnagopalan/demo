package number_programming;

import java.util.Scanner;

public class MultipleTables {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter which digit multiple table want:");
	int h=sc.nextInt();
	System.out.print("Upto which digit the multiple table want to show:");
	int h1=sc.nextInt();
	for(int i=0;i<=h1;i++)
	{
		System.out.println(h+"*"+i+"="+ i*h);
	}
	sc.close();
}
}
