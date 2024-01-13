package app.textRevers;

public class StringRevers {
	public static char[] reverse(String word) {
		char[] charWord = word.toCharArray();
		int startPoint = 0;
		int endPoint = charWord.length - 1;
		while (startPoint <= endPoint) {
			while (startPoint < charWord.length - 1 && !Character.isLetter(charWord[startPoint])) {
				startPoint++;
			}
			while (endPoint > 0 && !Character.isLetter(charWord[endPoint])) {
				endPoint--;
			}

			if (startPoint <= endPoint) {
				char temp = charWord[startPoint];
				charWord[startPoint] = charWord[endPoint];
				charWord[endPoint] = temp;
				startPoint++;
				endPoint--;
			}
		}
		return charWord;
	}
}
