package hangmanworking;

import java.util.Scanner;

public class HangMan {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		startGame();
//		guessLetter();
		genWord();
		


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

	public static void genWord() {
		String finalAnswer = "";
		int randomNum = (int)(Math.random() * (10) + 1) + 1;

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
		
		
//		switch (randomNum) {
//		case randomNum = 
//		
//		
//		
//		
//		}

	}

	public static void guessLetter() {
		String letterGuess;
		System.out.println("Guess a letter A-Z");
		letterGuess = sc.next();

		// TODO add if statement checking if word contains letterGuess
		System.out.println(letterGuess);

	}

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
		System.out.println("      /_______|________\\ \\n");
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
		System.out.println("      /_______|________\\ \\n");
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
		System.out.println("      /_______|________\\ \\n");
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
		System.out.println("      /_______|________\\ \\n");
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
		System.out.println("      /_______|________\\ \\n");
	}

} // end class
