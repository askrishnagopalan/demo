package string_programming;
import java.util.Scanner;
public class Reverse_String {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Stirng:");
	String a=sc.nextLine();
	String b="";
	char[] c=a.toCharArray();
	for(int i=0;i<c.length;i++) 
	{char e;
		e=c[i];
		b=e+b;
	}
	System.out.println(b);
	sc.close();
}
}
