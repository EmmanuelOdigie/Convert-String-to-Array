package JavaConvertStringToArray; // projected created in eclipse

public class LoopConvertedStringArray {// public class 'LoopConvertedStringArray' class

	public static void main(String[] args) {// reads, runs & executes
		String word = "Horiscope"; // String variable name 'word' set to Horiscope
		char[] convert = word.toCharArray(); // in variable 'convert' it takes the word horiscope 
		// that variable word is attached to and calls onto '.toCharArray' which converts the string
		// to character array
		
		for(char newArray : convert) { // for loop gets variable 'convert' to pass down details
			// char 'newArray' 
			System.out.println(newArray); // displays the loop
		}

	}

}
// result:
//H
//o
//r
//i
//s
//c
//o
//p
//e