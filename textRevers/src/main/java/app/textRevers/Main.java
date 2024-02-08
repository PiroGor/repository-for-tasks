package app.textRevers;


import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		selectToExecute();
	}

	/**
	 * Method name: choicerOfProgram
	 * <p>
	 * <p>
	 * Inside the function: Prints simple interface to choose program to execute.
	 */

	private static void selectToExecute() {
		System.out.println();
		System.out.print( """
        * * * * * * * * * * * * * * * * * *
								* SELECT WHICH PROGRAM TO EXECUTE *
								*---------------------------------*
								* 1 - Anagrams                    *
								* 2 - IntegerDivision			  *
								* 3 - CharsCounter                *
								*								  *
								* # - Any symbol to exit          *
								* * * * * * * * * * * * * * * * * *
								>
								""");

		String choice=scanner.nextLine();

		if(choice.equals("1")){
			reverseSentenceExecutor();
		}else if(choice.equals("2")) {
			intDivisionExecutor();
		}else if(choice.equals("3")){
			charsCounterExecutor();
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
	private static void reverseSentenceExecutor(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n" +
							"* Please, enter your sentence:     " );

		System.out.println( "* Reversed sentence: \n"+
							"* "+Reverser.reverseSentence(scanner.nextLine())+
							"\n* * * * * * * * * * * * * * * * * *\n");

		askToContinue();
	}

	/**
	 * Method name: division
	 * <p>
	 * <p>
	 * Inside the function: Prints simple interface to input dividend and divisor.
	 */
	private static void intDivisionExecutor(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n"+
							"*Please, enter a dividend: ");
		int dividend= scanner.nextInt();
		System.out.println("* Enter a divisor: ");
		int divisor= scanner.nextInt();
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(IntDivision.divide(dividend,divisor));

		askToContinue();
	}

	/**
	 * Method name: askToContinueProgram
	 * <p>
	 * <p>
	 * Inside the function: Print the question to continue program or quit.
	 */
	private static void askToContinue(){
		System.out.println("Do you want to continue this session? y/n   ");
		if(scanner.next().equals("y")){
			selectToExecute();
		}else if(scanner.next().equals("n")){
			System.out.println("\nShutting down...\nBye bye!");
			scanner.close();
		}else{
			System.out.println("Please, chose y or n");
			askToContinue();
		}
	}

	/**
	 * Method name: charsCounterExecutor
	 * <p>
	 * <p>
	 * Inside the function: Print simple interface to insert the world/sentence to count chars.
	 */
	private static void charsCounterExecutor(){
		System.out.println( "* * * * * * * * * * * * * * * * * *\n"+
							"*   Insert the word or sentence   * \n"+
							"* * * * * * * * * * * * * * * * * *");
		System.out.println(CreateOutputLook.outputForCountedChars(scanner.nextLine()));
		System.out.println("* * * * * * * * * * * * * * * * * *\n");
		askToContinue();
	}

}
