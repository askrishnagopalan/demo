package string_programming;

import java.util.Arrays;

public class CharSequence_methods {
	    public static void main(String[] args) {

	        CharSequence cs = "Java Programming";

	        System.out.println("Length: " + cs.length());

	        System.out.println("Character at index 2: " + cs.charAt(2));

	        System.out.println("Subsequence: " + cs.subSequence(0, 4));

	        System.out.println("String form: " + cs.toString());
	        
	        System.out.println("Is Empty: " + cs.isEmpty());
	        
	        System.out.println("chars: " + Arrays.toString(cs.chars().toArray()));
	        
	        System.out.println("codepoints: " +Arrays.toString( cs.codePoints().toArray()));
	    }
}
