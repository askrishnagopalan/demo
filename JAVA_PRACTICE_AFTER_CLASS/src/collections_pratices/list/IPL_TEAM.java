package collections_pratices.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IPL_TEAM {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of players:");
	int a=sc.nextInt();
	sc.nextLine();
	List<String> CSK= new ArrayList<>(a);
	List<String> RCB= new ArrayList<>(a);
	System.out.println("Enter the CSK Players name:");
	for(int i=0;i<a;i++) {
		System.out.println(i+":");
		CSK.add(sc.nextLine());
	}
	//System.out.println("The Players are :"+ CSK);
	Iterator<String> ite1=CSK.iterator();//Print using Iterator
	while(ite1.hasNext()) {
		System.out.println(ite1.next());
	}
	System.out.println("Enter the RCB Players name:");
	for(int i=0;i<a;i++) {
		System.out.println(i+":");
		RCB.add(sc.nextLine());
	}
	//System.out.println("The Players are :"+ RCB);
	Iterator<String> ite2=RCB.iterator();//Print using Iterator
	while(ite2.hasNext()) {
		System.out.println(ite2.next());
	}
	if(CSK.contains("Dhoni")) {
		System.out.println("CSK ku visul podu");
	}
	else {
		System.out.println("definitly not");
	}
	if(RCB.contains("Virat")) {
		System.out.println("esala cut numtha");
	}
	else {
		System.out.println("nama Bangalure");
	}
	sc.close();
}
}
