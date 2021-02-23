package stringMani;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println(countWords(str));
	}
	public static int countWords(String str) {
		int count = 0;
		String[] strs = str.split("\\s");
		return strs.length;
	}
}
