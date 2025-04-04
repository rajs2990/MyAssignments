package week1.day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the range of fibonacci series");
		int range = scanner.nextInt();
		int first=0;
		int second=1;
		int i;
        
        for(i=0;i<range;i++)
        {
        	System.out.print(first+ " ");
        	int next = first+second;
        	first=second;
        	second=next;
        	
        }
        scanner.close();

	}

}
