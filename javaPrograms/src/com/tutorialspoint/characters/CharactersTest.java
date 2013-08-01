package com.tutorialspoint.characters;

public class CharactersTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		
		System.out.println("char ch = 'a': "+ch);
		// Unicode for uppercase Greek omega character
		char uniChar = '\u039A';
		System.out.println("char uniChar = '\u039A': "+uniChar);
		// an array of chars
		char[] charArrays = {'a','b','c','d'};
		
		for(char cArray : charArrays){
			System.out.print("'"+cArray+"' ,");
		}
		System.out.println("char[] charArrays = {'a','b','c','d'}: "+charArrays[0]);
		
		Character chrs = new Character('a');
		System.out.println("Character chrs = new Character('a'): "+chrs);
		// Here following primitive char 'a'
		// is boxed into the Character object ch
		Character ch1 = 'A';
		System.out.println("Character ch1 = 'A': "+ch1);
		// Here primitive 'x' is boxed for method test,
		// return is unboxed to char 'c'
		char c = test('a');
		System.out.println("char c = test('a'): "+c);
		
		System.out.println("She said \"Hello!\" to me.");
		
		System.out.println("ch1.isLetter(uniChar): "+ ch1.isLetterOrDigit(uniChar));
		System.out.println("ch1.isDigit(ch): "+ ch1.isDigit(ch));
		System.out.println("ch1.isWhitespace(ch): "+ ch1.isWhitespace(ch));
		System.out.println("ch1.isUpperCase(ch): "+ ch1.isUpperCase(ch));
		System.out.println("ch1.isLowerCase(ch): "+ ch1.isLowerCase(ch));
		System.out.println("ch1.toUpperCase(ch): "+ ch1.toUpperCase(ch));
		System.out.println("ch1.toLowerCase(ch): "+ ch1.toLowerCase(ch));
		System.out.println("charArrays.toString(): "+ charArrays.toString());
	}

	private static char test(char charac) {
		// TODO Auto-generated method stub
		System.out.println("private static char test(char charac): "+charac);
		return charac;
	}

}
