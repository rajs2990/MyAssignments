package week1.day2;

public class Palindrom {

	public static void main(String[] args) {
		int input = 1234;
        int output = 0;
        int temp = input;
        
        for (; temp != 0; temp /= 10) {
            int digit = temp % 10;
            output = output * 10 + digit;
        }
        System.out.println("Reversed Number: " + output);
        if (input == output) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
	}

}
