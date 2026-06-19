package string_programming;

import java.util.Scanner;

public class StringBuffer_Methods {
public static void main(String[] args) {
	System.out.println("Enter the data sb               : ");
	Scanner sc= new Scanner(System.in);
	StringBuffer sb= new StringBuffer(sc.nextLine());
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("Enter the append data sb1       : ");
	//System.out.println("StringBuffer capacity(): "+sb.capacity());
	StringBuffer sb1= new StringBuffer(sc.nextLine());
	System.out.println("StringBuffer sb.append(sb1)     : "+sb.append(sb1));
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("StringBuffer sb.insert(6, \" \"): "+sb.insert(6, " "));
	System.out.println("Enter the replace data sb2      : ");
	StringBuffer sb2= new StringBuffer(sc.nextLine());
	//System.out.println("StringBuffer replace(): "+sb.replace(0, 3, sb2)); 
	//"The error occurs because StringBuffer.replace() expects the third argument to be a String, not a StringBuffer."
	System.out.println("StringBuffer replace()          : "+sb.replace(0, 6, sb2.toString()));
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("StringBuffer delete()           : "+sb.delete(12, 18));
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("StringBuffer reverse()          : "+sb.reverse());
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("StringBuffer reverse()          : "+sb.reverse());
	System.out.println("StringBuffer length()           : "+sb.length());
	System.out.println("StringBuffer sb.append(sb1)     : "+sb.append(" is very important for Beginner Student before studing Python. java is important"));
	System.out.println("StringBuffer length()           : "+sb.length());
	System.out.println("StringBuffer capacity()         : "+sb.capacity());
	System.out.println("Enter the index   charAt()          :");
	int a=sc.nextInt();
	if(a >= 0 && a < sb.length()) {
	    System.out.println("StringBuffer charAt()        : " + sb.charAt(a));
	} else {
	    System.out.println("Invalid index");
	}
	System.out.println("Enter the index   setCharAt()          :");
	int b=sc.nextInt();
	if(b >= 0 && b < sb.length()) {
		System.out.println("Enter the character           :");
		char c=sc.next().charAt(0);
		sb.setCharAt(b, c);
		System.out.println("StringBuffer setCharAt()             : "+ sb);
	   
	} else {
	    System.out.println("Invalid index");
	}
	System.out.println("Enter the statring index of SubString()        :");
	int d=sc.nextInt();
	if(d >= 0 && d < sb.length()) {
	System.out.println("StringBuffer subString(): "+sb.substring(d));
	} else {
	    System.out.println("Invalid index");
	}
	System.out.println("StringBuffer BEFORE ensurecapacity(): "+sb.capacity());
	System.out.println("Enter the ensurecapacity: ");
	int e=sc.nextInt();
	sb.ensureCapacity(e);
	System.out.println("StringBuffer AFTER ensurecapacity(): "+sb.capacity());
	System.out.println("StringBuffer BEFORE trimToSize(): "+sb.capacity());
	sb.trimToSize();
	System.out.println("StringBuffer After trimToSize(): "+sb.capacity());
	sc.nextLine();
	System.out.println("Enter the string to Search : ");
	String str=sc.nextLine();
	sb.indexOf(str);
	System.out.println("StringBuffer indexof(): "+sb.indexOf(str));
	sc.nextLine();
	System.out.println("Enter the string to Search : ");
	String str1=sc.nextLine();
	sb.indexOf(str1);
	System.out.println("StringBuffer lastindexof() : "+sb.indexOf(str1));
	/*
	System.out.println("StringBuffer lastindexof(): ");
	System.out.println("StringBuffer append(): ");*/
	sc.close();
}
}
