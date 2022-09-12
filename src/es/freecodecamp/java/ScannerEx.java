/**
 * 
 */
package es.freecodecamp.java;

import java.util.Scanner;

/**
 * @author AdminXtorm
 *
 */
public class ScannerEx {

	//init
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me what name i'm thinking of?");
		String entrada = sc.nextLine();
		while (!(entrada.equals("Bob"))) {
			System.out.println("Wrong answer, Try again");
			entrada = sc.nextLine();
		}
		System.out.println("You are right, it was Bob");

		
		System.out.println("Type your age now: ");
		int age = Integer.parseInt(sc.nextLine());
		if (age >=13) {
			System.out.println("You can ride!");
		} else {
			System.out.println("You can't ride!");
		}
		
	}

}
