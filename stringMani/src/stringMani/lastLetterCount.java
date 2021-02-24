package stringMani;
import java.util.Scanner;
public class lastLetterCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println(helper(str));
		System.out.println(convertString(str));
	}
	private static int helper(String str) {
		String[] strs = str.split(" ");
		int count = 0;
		for (String s : strs) {
			if (s.charAt(s.length() - 1) == 's' || s.charAt(s.length() - 1) == 't') {
				count++;
			}
		}
		return count;
	}
	private static String convertString(String str) {
		String[] strs = str.split(" ");
		StringBuilder sb = new StringBuilder();
		int firsts = 0;
		int firstt = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].charAt(strs[i].length() - 1) == 's') {
				firsts = i;
				break;
			}
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].charAt(strs[i].length() - 1) == 't') {
				firstt = i;
				break;
			}
		}
		String tmp = strs[firsts];
		strs[firsts] = strs[firstt];
		strs[firstt] = tmp;
		for (String s : strs) {
			sb.append(s);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
