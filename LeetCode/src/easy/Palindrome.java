package easy;

public class Palindrome {

	public boolean isPalindrome(int x) {
		int temp = x;
		int digit = 0, reverse = 0;
		while (x > 0) {
			digit = x % 10;
			reverse = digit + reverse * 10;
			x = x / 10;
		}
		if (temp != reverse)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.isPalindrome(-7));
	}

}
