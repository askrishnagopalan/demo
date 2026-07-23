package collections_pratices.set;

import java.util.HashSet;

public class HashSet_Example {
public static void main(String[] args) {
	HashSet<String> Friends= new HashSet<>();
	Friends.add("Aravindan");
	Friends.add("Aarthi");
	Friends.add("SakthiSundar");
	Friends.add("Vicky");
	Friends.add("Narandhar Modi");
	//Friends.add(null);
	System.out.println("Friends"+Friends);
	System.out.println("Size is  "+Friends.size());
	Friends.remove("Ram");
	Friends.remove("Narandhar Modi");
	Friends.remove(Friends);//Dout Explain Me
	System.out.println(Friends);
	System.out.println("Size is  "+Friends.size());
	if(Friends.contains("SakthiSundar")) {
		System.out.println("Friends contains(\"SakthiSundar\")  " +true);
	}
	else {
		System.out.println(false);
	}
	System.out.println("***Before clear()***");
	System.out.println("isEmpty "+Friends.isEmpty());
	System.out.println("**************");
	for(String aaa:Friends) {
		System.out.println(aaa.hashCode());
	}
	for(String aaa:Friends) {
		System.out.println(aaa);
	}
	HashSet<String> FriendsCopy=(HashSet)Friends.clone();
	System.out.println("FriendsCopy"+FriendsCopy);
	
	Friends.clear();
	System.out.println("***After clear()***");
	System.out.println("isEmpty "+Friends.isEmpty());
	System.out.println("**************");
}
}
