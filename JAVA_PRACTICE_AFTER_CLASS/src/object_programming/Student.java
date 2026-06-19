package object_programming;

import java.util.Scanner;

public class Student {
public Student() {
	int sid;
	String name;
	String date;
	int standard;
	double totalmark;
}
Student(int sid,String name,String date,int standard,double totalmark){
	
}
public static void main(String[] args) {
	System.out.println("Welcome");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student id:");
	int sid=sc.nextInt();
	System.out.println("Enter the student name:");
	String name=sc.next();
	System.out.println("Enter the student D.O.B:");
	String date=sc.next();
	System.out.println("Enter the student standard:");
	int standard=sc.nextInt();
	System.out.println("Enter the student totalmark:");
	double mark=sc.nextDouble();
}
}

