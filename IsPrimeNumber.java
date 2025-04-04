package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args)
	{
        int number = 29;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
         
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to check further if already divisible
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}