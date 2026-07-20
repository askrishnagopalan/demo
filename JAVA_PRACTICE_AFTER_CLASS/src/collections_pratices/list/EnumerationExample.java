package collections_pratices.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {

        Vector<String> languages = new Vector<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("SQL");
        languages.add("Selenium");

        Enumeration<String> e = languages.elements();

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());

        }
}
}
