package collections_pratices.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Example {
public static void main(String[] args) {
	List<String> Friends= new ArrayList<>();
	Friends.add("Aravindan");
	Friends.add("Aarthi");
	Friends.add("vicky");
	Friends.add("sivasankari");
	Friends.add("lavanya");
	Friends.add("thiru");
	Friends.add("santhosh");
	Friends.add("ganesh");
	Friends.add("sakthi");
	Friends.add("Aravindan");
	Friends.add("Aravindan");
	System.out.println(Friends);
	Friends.remove(10);
	System.out.println("After removal of index 10 :"+Friends);
	Friends.remove("Aravindan");
	System.out.println("After removal of name \"Aravindan\" :"+Friends);// It removes Aravindan which is in first occurance
	Friends.remove("Aravindan");
	System.out.println("After removal of name \"Aravindan\" :"+Friends);//
	Friends.add("Aravindan THE MASS");
	System.out.println(Friends);
	System.out.println("Size of Friends arraylist:"+ Friends.size());
	System.out.println("Printing the ArrayList using for each loop:");
	for(String AAA:Friends) {
		System.out.println(AAA);
	}
	System.out.println("Printing the ArrayList using for loop:");
	for(int i=0;i<Friends.size();i++) {
		System.out.println("index of: "+" "+i+"  value is :"+" "+Friends.get(i));
	}
	//Friends.sort(null);
	//System.out.println("Sorted Array list :"+Friends);
	System.out.println("Before sort: "+Friends);
	Friends.sort(Comparator.naturalOrder());
	System.out.println("sort assending order: "+Friends);
	Friends.sort(Comparator.reverseOrder());
	System.out.println("sort descending order: "+Friends);
	Friends.sort((a,b)->a.length()-b.length());
	System.out.println("sort based on length: "+Friends);
	Friends.add("santhosh");
	Friends.add("Aravindan THE MASS");
	Friends.add(null);
	System.out.println(Friends);
	System.out.println("Print last index value of \"santhosh\" :"+ Friends.lastIndexOf("santhosh"));
	System.out.println("Print first index value of \"santhosh\" :"+ Friends.indexOf("santhosh"));
	System.out.println("The value is present \"santhosh\" :"+ Friends.contains("santhosh"));
	System.out.println("The value is present \"Aravindan\" :"+ Friends.contains("Aravindan"));
	System.out.println("List is empty :"+ Friends.isEmpty());
	System.out.println("Removing all:"+Friends.removeAll(Friends));
	System.out.println("List is empty :"+ Friends.isEmpty());
}
}
