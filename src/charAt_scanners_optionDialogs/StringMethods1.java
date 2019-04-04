package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		 String bozo = "Where are my pants ? HEY ! Why did you throw them in the sewer ! Now they belong to the Bozos !";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		 System.out.println(bozo.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		  System.out.println (bozo.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		  for (int i = 0; i < bozo.length(); i++) {
			System.out.println(bozo.charAt(i));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		  for (int i = 0; i < bozo.length(); i++) {
			if ("t".charAt(0) == (bozo.charAt(i))) {
				System.out.println("t is at index " + i);
			}
		}
	}
}


