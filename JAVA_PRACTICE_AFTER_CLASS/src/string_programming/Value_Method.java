package string_programming;

public class Value_Method {
	public static void main(String[] args) {
		Byte bb=Byte.valueOf((byte)1);//
		Short ss=2;//AutoBoxing
		Integer ii=3;//AutoBoxing
		Long ll=20l;//AutoBoxing
		Float ff=Float.valueOf(30.0f);
		Double dd=40.0; //AutoBoxing
		Character cc='A'; //AutoBoxing
		Boolean boo=false; //AutoBoxing
		byte b=bb.byteValue();
		short s=ss.shortValue();
		int i=ii.intValue();
		long l=ll.longValue();
		float f=ff.floatValue();
		double d=dd.doubleValue();
		char c=cc.charValue();
		boolean bo=boo.booleanValue();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bo);
	}
}
