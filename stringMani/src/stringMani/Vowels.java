package stringMani;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.toUpperCase(string.charAt(i)) == 'A' || Character.toUpperCase(string.charAt(i)) == 'E' 
					|| Character.toUpperCase(string.charAt(i)) == 'I' || Character.toUpperCase(string.charAt(i)) == 'O' 
					|| Character.toUpperCase(string.charAt(i)) == 'U') {
					count++;
			}
		}
		System.out.println("The number of vowels is " + count);
	}
}
