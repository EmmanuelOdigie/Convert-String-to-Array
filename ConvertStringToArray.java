package JavaConvertStringToArray;// project made in eclipse

public class ConvertStringToArray {// public class 'ConvertStringToArray' made

	public static void main(String[] args) {
		String word = "Tommorrow"; // String variable 'word' made and set as text "Tomorrow"
		char[] convert = word.toCharArray(); // 'char' variable name 'convert' made 
		// in 'convert' it takes in variable 'word'and calls onto 'toCharArray();'method 
		// this then converts the String to characters 
		
		System.out.println(convert[0]);// display first letter of the array

	}

}

//Result: T