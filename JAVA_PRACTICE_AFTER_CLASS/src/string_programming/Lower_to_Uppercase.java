package string_programming;
import java.util.Scanner;
public class Lower_to_Uppercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=sc.nextLine();
		char[] b=a.toCharArray();
		String c="";                //for storing the lower case string
		for(int i=0;i<b.length;i++)
		{
			char d;
			if(b[i]>='a' && b[i]<='z')
			{
				d=(char)(b[i]-32); //typecasting int to char
			}
			else
			{
				d=b[i];
			}
			c=c+d;
		}
		System.out.println(c);
		sc.close();
	}

}
