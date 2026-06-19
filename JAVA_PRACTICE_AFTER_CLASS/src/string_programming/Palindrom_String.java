package string_programming;
import java.util.Scanner;
public class Palindrom_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String a=sc.nextLine();
		char[] b= a.toCharArray();
		int start=0,end=b.length-1;Boolean res=true;
		while(b[start]!=b[end]) {
			res=false;
			break;}
		if(res) {
			System.out.println("Palindrom");
		}
		else
			{System.out.println("not a palindrom");}
		sc.close();
	}

}
