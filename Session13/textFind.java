/** there's a function called find that takes two strings. first string
  being a word and second one can be a paragraph. it checks
 * to see if the first string is in the second string. if it is,
 * it returns the sentence and turn the word mathched to uppercase.
 * if it can't find anything it returns "not found".
 */

import java.util.Scanner;

public class textFind {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a word to find: ");
	String word = input.nextLine();
	System.out.println("Enter a paragraph: ");
	String paragraph = input.nextLine();
	System.out.println(find(word, paragraph));
    }

    public static void GeneralCheck(String word, String paragraph) {
	if (paragraph.contains(word))
		find(word, paragraph);



    public static String find(String word, String paragraph) {
	String[] sentences = paragraph.split("[.!?]");
	for (int i = 0; i < sentences.length; i++) {
	    if (sentences[i].contains(word)) {
		return sentences[i].replaceAll(word, word.toUpperCase());
	    }
	}
	return "not found";
    }
}
