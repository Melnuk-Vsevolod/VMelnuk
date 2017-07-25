package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int lastNumber = 0;
		int sumOddNumbers = 0;
		int sumEvenNumbers = 0;
		int fibAmount = 0;
		int fibF1 = 0;
		int fibF2 = 0;

	/*	System.out.println("Enter last number");

		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			lastNumber = sc.nextInt();
			System.out.println(lastNumber);
		}

		for (int i = lastNumber; i > 0; i--) {
			if (i % 2 == 0) {

				System.out.println(i);
				sumEvenNumbers += i;
			}
		}

		System.out.println("Sum even= " + sumEvenNumbers);

		for (int i = 1; i < lastNumber + 1; i++) {
			if (i % 2 == 1) {

				System.out.println(i);
				sumOddNumbers += i;
			}
		}
		System.out.println("Sum odd= " + sumOddNumbers);*/

		//////////////////////////////////// Fibonacci
		
		System.out.println("Enter last number");

		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			lastNumber = sc.nextInt();
			
		}
		

		System.out.println("Enter amount");

		Scanner scFib = new Scanner(System.in);

		if (scFib.hasNextInt()) {
			fibAmount = scFib.nextInt();
		}

		if (lastNumber % 2 == 0) {
			fibF2 = lastNumber;
			fibF1 = lastNumber - 1;

		} else {
			fibF1 = lastNumber;
			fibF2 = lastNumber - 1;
		}
		
		if(fibF1<fibF2){
			System.out.println(fibF1);
			
			
		}else{
			System.out.println(fibF2);
		}

		for (int i = 0; i < fibAmount; i++) {
			
			
			

			int temp = fibF1;
			fibF1 = fibF2;
			fibF2 = fibF1 + temp;
			System.out.println(fibF1);
			System.out.println(fibF2);
		}

	}

}
