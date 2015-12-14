package myFirstPackage;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//This string variable will
		String question;
		boolean proceed = true;

		//The while loop will continuously run the code inside over and over until proceed == false
		while(proceed) {
			System.out.println("What troubles you?");
			
			Scanner input = new Scanner(System.in);
			question = input.nextLine();
			
			String questionEdit = question.toLowerCase(); //This will make all the letters in the question String lowercase
			if(questionEdit.contains("who") || 
					questionEdit.contains("what") ||
					questionEdit.contains("where")||
					questionEdit.contains("why") ||
					questionEdit.contains("how") ||
					questionEdit.contains("when") ||
					questionEdit.contains("will")||
					questionEdit.contains("was")) {
				System.out.println(getNiceAnswer());
			} else {
				System.out.println(getNastyAnswer());
			}
			
			//If the user enters "stop" then we will not set proceed to false so that the loop stops running
			if(question.equalsIgnoreCase("stop")) {
				proceed = false;
			} 
		}
	}

	/**
	 * This method will return a randomly selected NICE String
	 * @return
	 */
	public static String getNiceAnswer() {
		String answer = "outlook unclear";
		Random randomNumber = new Random();
		
		int number = randomNumber.nextInt(4) + 1;
		
		switch(number) {
		case 1:
			answer = "Most definitely";
			break;
		case 2:
			answer = "Good chance";
			break;
		case 3:
			answer = "Anything is possible if you drink enough";
			break;
		case 4:
			answer = "Of course";
			break;
		}
		
		return answer;
	}

	/**
	 * This method will return a randomly generated NASTY String
	 * @return
	 */
	public static String getNastyAnswer() {
		String answer = "outlook unclear";
		Random randomNumber = new Random();
		
		int number = randomNumber.nextInt(4) + 1;
		
		switch(number) {
		case 1:
			answer = "Stupidity is a virtue";
			break;
		case 2:
			answer = "screw you";
			break;
		case 3:
			answer = "you're a witty fool";
			break;
		case 4:
			answer = "Why dont you ask me a real quesiton, dummy-head";
			break;
		}
		
		return answer;
	}

}
