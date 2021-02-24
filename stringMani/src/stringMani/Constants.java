package stringMani;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Constants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println(countConstants(str));
		System.out.println(replace(str));
	}
	private static int countConstants(String str) {
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!set.contains(ch[i])) {
				count++;
			}
		}
		return count;
	}
	private static String replace(String str) {
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!set.contains(ch[i])) {
				ch[i] = '*';
			}
		}
		str = String.valueOf(ch);
		return str;
	}
}
