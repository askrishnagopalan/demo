package string_programming;

public class ValueOf_WrapperClass {
public static void main(String[] args) {
	byte b=1;
	short s=2;
	int i=3;
	long l=20l;
	float f=30.0f;
	double d=40.0;
	char c='A';
	boolean bo=false;
	String str="ABC";
	Byte bb=Byte.valueOf(b);
	Short ss=Short.valueOf(s);
	Integer ii=Integer.valueOf(i);
	Long ll=Long.valueOf(l);
	Float ff=Float.valueOf(f);
	Double dd=Double.valueOf(d);
	Character cc=Character.valueOf(c);
	Boolean boo=Boolean.valueOf(bo);
	Integer iii=Integer.valueOf(str);
	System.out.println(bb);
	System.out.println(ss);
	System.out.println(ii);
	System.out.println(ll);
	System.out.println(ff);
	System.out.println(dd);
	System.out.println(cc);
	System.out.println(boo);
	System.out.println(iii);
}
}
