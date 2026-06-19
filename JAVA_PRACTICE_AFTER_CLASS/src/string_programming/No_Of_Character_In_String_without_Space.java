package string_programming;

import java.util.Scanner;

public class No_Of_Character_In_String_without_Space {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String a=sc.nextLine();
		char[] b=a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]!=' ') {
			count++;}
		}
		System.out.println(count);
		sc.close();
	}

}
