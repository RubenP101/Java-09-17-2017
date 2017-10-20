//Ruben Prado
//Ruben Prado
//CST-105
//Excercise7
//Charles Lively
//This program loops over the first 100000 positive integers and displays the integers, only if is a palindromic prime number.

package primePalindromic;

public class PrimeandPalindromicnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primePalindromicnums = "";
		int newLineCount = 0;
		// Begins count if loop for prime wiht 100000
		for (int b = 1; b <= 100000; b++) {
			if (isPrime(b) && isPalindrome(b)) {
				primePalindromicnums += Integer.toString(b) + "\t";
				newLineCount++;
			}
			if (newLineCount == 4) {
				primePalindromicnums += "\n";
				newLineCount = 0;
	}
	}
		System.out.println(primePalindromicnums);
	}

	// Program will returns true numbers if it is a Prime
	public static boolean isPrime(int input) {
		int count = 0;
		for (int c = input; c > 0; c--) {
			if (input % c == 0) {
				count++;
	}
	}
		if (count == 2) {
			return true;
	}
		return false;
	}
	// Program will returns true numbers if it is a palindrome
	public static boolean isPalindrome(int input) {
		String number = Integer.toString(input);
		int length = number.length();
		int first = 0;
		int last = length - 1;
		int middle = (first + last) / 2;
		int d;
	//  First and last for palindrome
		for (d = first; d <= middle; d++) {
			if (number.charAt(first) == number.charAt(last)) {
				first++;
				last--;
			} else {
				break;
			}
		}
		
		if (d == middle + 1) {
			return true;
		} else {
			return false;
		}
		
	}

	
}
