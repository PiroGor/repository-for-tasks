package app.textRevers;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {

		System.out.println(reverseYourString("qwe1rty5u rty888jnm!"));

	}

	/*1.rename method from makeReverse to reverseYourString
	2.make method which return String not just void
	3.change logic a little bit
	*  */
	public static String reverseYourString(String str) {
		final ArrayList<String> words=new ArrayList<>();
		Collections.addAll(words, str.split(" "));
		final ArrayList<String> splitWords=new ArrayList<>();
		words.forEach(s-> splitWords.add(StringRevers.reverse(s)));
        return String.join(" ",splitWords);
	}
}
