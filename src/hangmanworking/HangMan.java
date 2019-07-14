package hangmanworking;

import java.util.Scanner;

public class HangMan {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		startGame();
//		guessLetter();
		genWord();
		
		// MORE TESTING CAN YOU SEE THIS

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
		int randomNum = (int)(Math.random() * (19) + 1) + 1;
		String finalAnswer = "";
		
		while(true) {
			System.out.println(randomNum);
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
