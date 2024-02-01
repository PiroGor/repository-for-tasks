package app.textRevers;


import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		choicerOfProgram();
	}

	/**
	 * Method name: choicerOfProgram
	 * <p>
	 * <p>
	 * Inside the function: Prints simple interface to choose program to execute.
	 */

	private static void choicerOfProgram() {
			System.out.println();
			System.out.print( """
        * * * * * * * * * * * * * * * * * *
								* SELECT WHICH PROGRAM TO EXECUTE *
								*---------------------------------*
								* 1 - Anagrams                    *
								* 2 - IntegerDivision			  *
								*								  *
								* # - Any symbol to exit          *
								* * * * * * * * * * * * * * * * * *
								>
								""");

			String choice=scanner.nextLine();

			if(choice.equals("1")){
				reverser();
			}else if(choice.equals("2")){
				division();
			}else{
				System.out.println("Shutting down...");
				scanner.close();
			}

	}

	/**
	 * Method name: reverser
	 * <p>
	 * <p>
	 * Inside the function: Prints simple interface to input sentence.
	 */
	private static void reverser(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n" +
							"* Please, enter your sentence:     " );

		System.out.println( "* Reversed sentence: \n"+
							"* "+Reverser.reverseSentence(scanner.nextLine())+
							"\n* * * * * * * * * * * * * * * * * *\n");
		askToContinueProgram();
	}

	/**
	 * Method name: division
	 * <p>
	 * <p>
	 * Inside the function: Prints simple interface to input dividend and divisor.
	 */
	private static void division(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n"+
							"*Please, enter a dividend: ");
		int dividend= scanner.nextInt();
		System.out.println("* Enter a divisor: ");
		int divisor= scanner.nextInt();
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(IntDivision.makeDivision(dividend,divisor));

		askToContinueProgram();
	}

	/**
	 * Method name: askToContinueProgram
	 * <p>
	 * <p>
	 * Inside the function: Prints question to continue program or quit.
	 */
	private static void askToContinueProgram(){
		System.out.println("Do you want to continue this session? y/n   ");
		if(scanner.next().equals("y")){
			choicerOfProgram();
		}else if(scanner.next().equals("n")){
			System.out.println("\nShutting down...\nBye bye!");
			scanner.close();
		}else{
			System.out.println("Please, chose y or n");
			askToContinueProgram();
		}
	}

}
