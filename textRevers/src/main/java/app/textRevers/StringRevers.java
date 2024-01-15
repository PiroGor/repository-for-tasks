package app.textRevers;

public class StringRevers {				//
	public static String reverse(String word) {		//chane the return type
		char[] wordCharArray = word.toCharArray(); //change name from charWord to wordCharArray
		int startPoint = 0;
		int endPoint = wordCharArray.length - 1;
		while (startPoint <= endPoint) {
			while (startPoint < wordCharArray.length - 1 && !Character.isLetter(wordCharArray[startPoint])) {
				startPoint++;
			}
			while (endPoint > 0 && !Character.isLetter(wordCharArray[endPoint])) {
				endPoint--;
			}

			if (startPoint <= endPoint) {
				char temp = wordCharArray[startPoint];
				wordCharArray[startPoint] = wordCharArray[endPoint];
				wordCharArray[endPoint] = temp;
				startPoint++;
				endPoint--;
			}
		}
        return new String(wordCharArray);
	}
}
