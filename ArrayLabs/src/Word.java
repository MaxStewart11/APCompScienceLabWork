
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
 private static String vowels = "AEIOUaeiou";   	//why is this here?
 																//why is it static?
 	//add an instance variable
 	private String word;
 
	//create a constructor
	public Word(String w) {
		word = w;
	}
	//create other methods
	//look at the sample runner code
	//on the lab handout
	public int getNumVowels() {
		int vowelCount = 0;
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				char c = word.charAt(i);
				if (c == vowels.charAt(j)) {
					vowelCount = vowelCount + 1;
				}
			}
		}
		return vowelCount;
		
		/*
		 * int numVowels = 0;
		
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i) == 'a' ) {
				numVowels++;
			} else if(name.charAt(i) == 'e') {
				numVowels++;
			} else if(name.charAt(i) == 'i') {
				numVowels++;
			} else if(name.charAt(i) == 'o') {
				numVowels++;
			} else if(name.charAt(i) == 'u') {
				numVowels++;
			}  else {
				numVowels = numVowels + 0;
			}
		}
		return numVowels;
		 */
	}
	
	public int getLength() {
		return word.length();
	}
	
	public void setWord(String w) {
		word = w;
	}
	//create a toString method
	public String toString() {
		String result = "Hi, I am a word that has the value = "+word;
		return result;
	}
	
	
}
