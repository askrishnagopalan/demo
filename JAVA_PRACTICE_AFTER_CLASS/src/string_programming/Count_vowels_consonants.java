package string_programming;
import java.util.Scanner;
public class Count_vowels_consonants {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the string:");
	String a = sc.nextLine();
	char[] b= a.toCharArray();
	int vcount=0,ccount=0;
	
	for(int i=0;i<b.length;i++) {
		if((b[i]>'A'&& b[i]<'Z')&&(b[i]>'a'&& b[i]<'z')) {
		if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U') 
		{
			vcount++;
		}	
		else {
			ccount++;
		}
			}
		else {
			System.out.println("Please enter valid data");
		}
	}
	System.out.println("vowels count: "+ vcount);
	System.out.println("consonants count: "+ ccount);
	sc.close();
}
}
