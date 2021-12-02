package interview_programs;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "badam";
		String res = isStringPalindrome(str) == true ? "Yes palindrome" : "Not palindrome";
		System.out.println(res);
	}
	
	public static boolean isStringPalindrome(String str) {
		int i = 0, j = str.length() -1;
		while(i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
