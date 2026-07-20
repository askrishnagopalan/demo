package collections_pratices.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {
public static void main(String[] args) {
	LinkedList<String> Friends= new LinkedList<>();
	Friends.add("Aravindan");
	Friends.add("Aarthi");
	Friends.add("Sivasankari");
	Friends.add("Lavanya");
	Friends.add("vicky");
	Iterator<String> ite1= Friends.iterator();
	System.out.println(Friends);
	while(ite1.hasNext()) {
		System.out.println(ite1.next());}
}
}
