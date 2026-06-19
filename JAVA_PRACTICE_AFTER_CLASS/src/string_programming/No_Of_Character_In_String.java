package string_programming;
import java.util.Scanner;
public class No_Of_Character_In_String {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE STRING:");
	String a=sc.nextLine();
	char[] b=a.toCharArray();
	int count=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]!=' '&&b[i]!='1'&&b[i]!='2'&&b[i]!='3'&&b[i]!='4'&&b[i]!='5'&&b[i]!='6'&&b[i]!='7'&&b[i]!='8'&&b[i]!='9'&&b[i]!='0'){
		count++;}
	}
	System.out.println("No.of.Characters: "+count);
	sc.close();
}
}
