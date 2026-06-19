package string_programming;

public class StringToPrimitive {
public static void main(String[] args) {
	String s1="89";
	String s2="125874963";
	String s3="30.0";
	String s4="40.96";
	String s5="A";
	String s6="True";
	int a=Integer.parseInt(s1);
	long b=Long.parseLong(s2);
	float c=Float.parseFloat(s3);
	double d=Double.parseDouble(s4);
	char e=s5.charAt(0);
	boolean f=Boolean.parseBoolean(s6);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
}
}
