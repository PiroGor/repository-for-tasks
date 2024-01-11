import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		makeReverse(str);
		
	}
	
	public static void makeReverse(String str) {
		String forSplit=" ";
		String[] words=str.split(forSplit);
		for(int i=0;i<words.length;i++) {
			StringRevers.reverse(words[i]);
		}

	}

}
