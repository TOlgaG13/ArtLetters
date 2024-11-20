package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		ArtLettersStar.printLettersArt("HELLO");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input some text: ");
		String input = sc.nextLine();
		
		ArtLettersStar.printLettersArt(input);
		    }

		
	}
		
	


