package app.textRevers;


import java.util.Arrays;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		choicerOfProgram();
	}

	private static void choicerOfProgram() {

			System.out.println("* * * * * * * * * * * * * * * * * *\n" +
					"* SELECT WHICH PROGRAM TO EXECUTE *\n" +
					"*---------------------------------*\n" +
					"* 1 - Anagrams                    *\n" +
					"* 2 - IntegerDivision			  *\n" +
					"*								  *\n" +
					"* # - Any symbol to exit          *\n" +
					"* * * * * * * * * * * * * * * * * *\n" +
					"> ");

			String choice=scanner.nextLine();

			if(choice.equals("1")){
				reverser();
			}else if(choice.equals("2")){

			}else{
				System.out.println("Shutting down...");
				scanner.close();
			}

	}

	private static void reverser(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n" +
				"* Please, enter your sentence:     " );

		System.out.println( "* Reversed sentence: \n"+
				"* "+Reverser.reverseSentence(scanner.nextLine())+
				"\n* * * * * * * * * * * * * * * * * *\n");
	}

}
