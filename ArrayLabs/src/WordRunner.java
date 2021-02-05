import static java.lang.System.*;


public class WordRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Word one = new Word("chicken");
		out.println(one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());

		one.setWord("alligator");
		out.println("\n\n"+one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());

		one.setWord("elephant");
		out.println("\n\n"+one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());

		
		
	}

}
