package main;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3 {
	public static void main(String[] args) {
		int ourGuess;
		int computerNumber;
		int guessCount = 0;
		boolean guessedNumber = false;
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		computerNumber = random.nextInt(100) + 1;
	
		while(!guessedNumber) {
			System.out.println("Enter your first guess!");
			ourGuess = keyboard.nextInt();
			guessCount++;
			
			if(ourGuess >= 1 && ourGuess <= 100) {
				if(ourGuess == computerNumber) {
					System.out.println("Well Done you guessed the number! in " + guessCount + " guesses! Ez Clap");
					guessedNumber = true;
				} else if(ourGuess > computerNumber) {
					System.out.println("Guess too high try again");
				} else if(ourGuess < computerNumber) {
					System.out.println("Guess too low try again");
				}
			}
			else {
				System.out.println("wasted guess! Pick a number between 0-100 inclusive");
			}
		}
	}
}

