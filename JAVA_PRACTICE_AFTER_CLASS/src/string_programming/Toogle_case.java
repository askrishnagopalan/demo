package string_programming;
import java.util.Scanner;
public class Toogle_case {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE TOGGLE CASE:");
		String a=sc.nextLine();
		String b="";
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			char d;
			if(c[i]>='A'&& c[i]<='Z') 
			{
			d=(char)(c[i]+32);
			}
				else if(c[i]>='a'&& c[i]<='z')
				{
				d=(char)(c[i]-32);
				}
				else 
				{
				d=(char)c[i];
			    }
              b=b+d;
			}
		System.out.println(b);
		sc.close();
		}
		
	}

