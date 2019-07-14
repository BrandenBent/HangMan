package hangmanworking;

import java.util.Scanner;

public class HangMan {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		startGame();

//		don't call genWord();, doesContain calls it inside of itself
//		genWord();

//		no need to call guessLetter as the method doesContain calls it
//		guessLetter();
		doesContain();

//		playerGuess(); <-- unnecessary method??

//		printHead();
//		printBody();
//		printLeftArm();
//		printRightArm();
//		printLeftLeg();
//		printYouLose();

	} // end main

	public static void startGame() {
		String startGame;
		System.out.println("Welcome to Hangman, type \"Start\" to begin");
		startGame = sc.next();
		if (startGame.equalsIgnoreCase("start")) {
			printHanger();

		}
	}

	public static String genWord() {
		String finalAnswer = "";
		int randomNum = (int) (Math.random() * (10) + 1) + 1;
 //		TODO learn how to count number of characters in a given string
		switch (randomNum) {
		case 1:
			finalAnswer = "green";
			break;
		case 2:
			finalAnswer = "water";
			break;
		case 3:
			finalAnswer = "rabbit";
			break;
		case 4:
			finalAnswer = "keyboard";
			break;
		case 5:
			finalAnswer = "coffee";
			break;
		case 6:
			finalAnswer = "minnesota";
			break;
		case 7:
			finalAnswer = "whiskey";
			break;
		case 8:
			finalAnswer = "backpack";
			break;
		case 9:
			finalAnswer = "sunshine";
			break;
		case 10:
			finalAnswer = "garbage";
			break;

		// TODO find out how to break string into individual characters
		}

		System.out.println(finalAnswer); // <-- test code
		return finalAnswer;
	}

//	public static void playerGuess() {
//		String playerGuess;
//		playerGuess = sc.next();
//		System.out.println(playerGuess);
//		
//	}

	public static String guessLetter() {
		String letterGuess;
		System.out.println("Guess a letter A-Z");
		letterGuess = sc.next();

		return letterGuess;

		// TODO add if statement checking if word contains letterGuess
//		System.out.println(letterGuess); <-- test 

	}

//	XXX idk what im doing, send help
	public static String doesContain() {
		String finalAnswer = "";
		boolean guessRight;
		if (finalAnswer == "") {
			finalAnswer = genWord();
//		System.out.println(finalAnswer); <-test code
		}
		int i = 0;

		do {
			String letterGuess = guessLetter();
			if (finalAnswer.contains(letterGuess)) {
				System.out.println("There is a(n) " + letterGuess);
				guessRight = true;
			} else {
				System.out.println("There is no " + letterGuess);
				guessRight = false;
//				i will only increment when guess is incorrect, neat
				i++;
			}

			if (guessRight) {
				System.out.println("Goodjob");
			}

			switch (i) {
			case 0:
				printHanger();
				break;
			case 1:
				printHead();
				break;
			case 2:
				printBody();
				break;
			case 3:
				printLeftArm();
				break;
			case 4:
				printRightArm();
				break;
			case 5:
				printLeftLeg();
				break;
			case 6:
				printYouLose();
				break;
			default:
				break;
			}
//		System.out.println(finalAnswer); <-- test to make sure answer doesn't change
		} while (i <= 6);

		return finalAnswer;
	} // holy shit that worked kinda

	public static void printHanger() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("       _______|_______ ");
		System.out.println("      /_______|_______\\ \n");
	}

	public static void printHead() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");
	}

	public static void printBody() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("      |       |");
		System.out.println("      |       |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");
	}

	public static void printLeftArm() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("    --|       |");
		System.out.println("      |       |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");
	}

	public static void printRightArm() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("    --|--     |");
		System.out.println("      |       |");
		System.out.println("              |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");
	}

	public static void printLeftLeg() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("    --|--     |");
		System.out.println("      |       |");
		System.out.println("     /        |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");
	}

	public static void printYouLose() {
		System.out.println("       _______ ");
		System.out.println("      |       |");
		System.out.println("      o       |");
		System.out.println("    --|--     |");
		System.out.println("      |       |");
		System.out.println("     / \\      |");
		System.out.println("              |");
		System.out.println("       _______|________ ");
		System.out.println("      /_______|________\\ \n");

		System.out.println("YOU LOSE!");
		System.exit(0);
	}

} // end class
