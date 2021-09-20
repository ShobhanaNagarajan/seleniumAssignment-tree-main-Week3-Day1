package week3.day1;

public class JustifyString {

	public static void main(String[] args) {
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
	}



	}

//operator compares memory address of String Value
// so if we need same text as output we should use  if(str3.equals(str4))


