package JavaConvertStringToArray;// project created in eclipse

public class ConvertStringToCharPT2 {// public class 'ConvertStringToCharPT2' class

	public static void main(String[] args) {//reads,runs & executes
		String word = "Finally";// String variable 'word' = Finally
		char[] convert = word.toCharArray();//char variable 'convert' 
		// this takes the variable 'word' using '.toCharArray();' to convert the string(word) into
		//character(letters)
		
		System.out.println(convert[0]); // display the first letter, numbers start from 0, 0 would
		// be the first letter and so on

	}

}

//Result: F