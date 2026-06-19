package string_programming;

public class StringBuffer_chars {
	    public static void main(String[] args) {
	        CharSequence cs = "KRISHNAGOPALAN";
	        int[]a=new int[cs.length()];
	        a=cs.chars().toArray();
	        for(int i=0;i<a.length;i++)
	        	System.out.print(a[i]+" ");
	    }
	}

