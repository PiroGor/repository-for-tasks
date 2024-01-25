package app.textRevers;


import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Please, enter your sentence: \n");
		Scanner scanner = new Scanner(System.in);
		System.out.println(Reverser.reverseSentence(scanner.nextLine()));
		scanner.close();
	}
}
