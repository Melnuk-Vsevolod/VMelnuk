package task1;

import fibonacci.LogicFib;

public class Main {

	public static void main(String[] args) {

		ReciveRangeFromUser rrfru = new ReciveRangeFromUser(new RangeFrom(), new RangeTo());
		rrfru.ReciveRangeNumFromUser();

		MakeList ml = new MakeList(rrfru.getRangeFrom(), rrfru.getRangeTo());

		LogicForList ls = new LogicForList(ml.getListAllNumInRange());
		ls.printArrays();

		
		
		////////////////Fibonacci///////////////
//		int indexMaxOdd = ls.listOdd.size() - 1;
//		int indexMaxEven = ls.listEven.size() - 1;
//
//		int maxOdd = (Integer) (ls.listOdd.get(indexMaxOdd));
//		int maxEven = (Integer) (ls.listEven.get(indexMaxEven));
//
//		LogicFib lgF = new LogicFib(maxOdd, maxEven);
//		lgF.printPersentege();

	}

}

// int lastNumber = 0;
// int sumOddNumbers = 0;
// int sumEvenNumbers = 0;
// int fibAmount = 0;
// int fibF1 = 0;
// int fibF2 = 0;
// int sumOddNumbersFib = 0;
// int sumEvenNumbersFib = 0;
// int tempSumOdd = 0;
// int tempSumEven = 0;
// int amountOddNumFib = 1;
// int amountEvenNumFib = 1;
//
// System.out.println("Enter last number");
//
// Scanner sc = new Scanner(System.in);
// if (sc.hasNextInt()) {
// lastNumber = sc.nextInt();
// System.out.println(lastNumber);
// }
//
// for (int i = lastNumber; i > 0; i--) {
// if (i % 2 == 0) {
//
// System.out.println(i);
// sumEvenNumbers += i;
// }
// }
//
// System.out.println("Sum even= " + sumEvenNumbers);
//
// for (int i = 1; i < lastNumber + 1; i++) {
// if (i % 2 == 1) {
//
// System.out.println(i);
// sumOddNumbers += i;
// }
// }
// System.out.println("Sum odd= " + sumOddNumbers);
//
////////////////////////////////////// Fibonacci
//
// System.out.println("Enter amount");
//
// Scanner scFib = new Scanner(System.in);
//
// if (scFib.hasNextInt()) {
// fibAmount = scFib.nextInt();
// }
//
// if (lastNumber % 2 == 0) {
// fibF2 = lastNumber;
// fibF1 = lastNumber - 1;
//
// } else {
// fibF1 = lastNumber;
// fibF2 = lastNumber - 1;
// }
//
// if (fibF1 < fibF2) {
// System.out.println(fibF1);
// System.out.println(fibF2);
//
// if (fibF1 % 2 == 0) {
// tempSumEven = fibF1;
// tempSumOdd = fibF2;
// } else {
// tempSumEven = fibF2;
// tempSumOdd = fibF1;
// }
// for (int i = 0; i < fibAmount - 2; i++) {
//
// int temp = fibF1;
// fibF1 = fibF2;
// fibF2 = fibF1 + temp;
//
// System.out.println(fibF2);
// if (fibF2 % 2 == 0) {
// tempSumEven += fibF2;
// amountEvenNumFib++;
//
// } else {
// tempSumOdd += fibF2;
// amountOddNumFib++;
// }
//
// }
// System.out.println("Sum odd= " + tempSumOdd + " Sum even= " + tempSumEven);
// System.out.println("Amount odd= " + amountOddNumFib + " Amount even= " +
// amountEvenNumFib);
// System.out.println("odd= " + (amountOddNumFib * 100) / (amountOddNumFib +
// amountEvenNumFib) + "%"
// + " % even= " + (amountEvenNumFib * 100) / (amountOddNumFib +
// amountEvenNumFib) + "%");
//
// } else {
// System.out.println(fibF2);
// System.out.println(fibF1);
//
// if (fibF1 % 2 == 0) {
// tempSumEven = fibF1;
// tempSumOdd = fibF2;
// } else {
// tempSumEven = fibF2;
// tempSumOdd = fibF1;
// }
//
// for (int i = 0; i < fibAmount - 2; i++) {
//
// int temp = fibF2;
// fibF2 = fibF1;
// fibF1 = fibF2 + temp;
//
// System.out.println(fibF1);
// if (fibF1 % 2 == 0) {
// tempSumEven += fibF1;
// amountEvenNumFib++;
//
// } else {
// tempSumOdd += fibF1;
// amountOddNumFib++;
// }
// }
// System.out.println("Sum odd= " + tempSumOdd + " Sum even= " + tempSumEven);
// System.out.println("Amount odd= " + amountOddNumFib + " Amount even= " +
// amountEvenNumFib);
// System.out.println("odd= " + (amountOddNumFib * 100) / (amountOddNumFib +
// amountEvenNumFib) + "%"
// + " % even= " + (amountEvenNumFib * 100) / (amountOddNumFib +
// amountEvenNumFib) + "%");
//
// }
