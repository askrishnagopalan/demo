package string_programming;

import java.util.Scanner;

public class StringBuffer_Methods_demo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.println("Original String      : " + sb);
        System.out.println("Length               : " + sb.length());
        System.out.println("Capacity             : " + sb.capacity());
        // append()
        sb.append(" Java");
        System.out.println("append()             : " + sb);
        // insert()
        sb.insert(5, "Programming ");
        System.out.println("insert()             : " + sb);
        // replace()
        sb.replace(0, 5, "Core");
        System.out.println("replace()            : " + sb);
        // delete()
        sb.delete(4, 16);
        System.out.println("delete()             : " + sb);
        // charAt()
        System.out.println("charAt(2)            : " + sb.charAt(2));
        // setCharAt()
        sb.setCharAt(0, 'J');
        System.out.println("setCharAt()          : " + sb);
        // substring()
        System.out.println("substring(5)         : " + sb.substring(5));
        // indexOf()
        System.out.println("indexOf(\"Java\")     : " + sb.indexOf("Java"));
        // lastIndexOf()
        System.out.println("lastIndexOf(\"a\")    : " + sb.lastIndexOf("a"));
        // ensureCapacity()
        System.out.println("Capacity Before ensureCapacity(): "+ sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacity After ensureCapacity() : "+ sb.capacity());
        // trimToSize()
        System.out.println("Capacity Before trimToSize()    : "+ sb.capacity());
        sb.trimToSize();
        System.out.println("Capacity After trimToSize()     : "+ sb.capacity());
        // reverse()
        sb.reverse();
        System.out.println("reverse()            : " + sb);
        sc.close();
    }

}
