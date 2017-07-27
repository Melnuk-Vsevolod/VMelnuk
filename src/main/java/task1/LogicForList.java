package task1;

import java.util.ArrayList;
import java.util.List;

public class LogicForList {

	List ml;
	private int maxOdd = 0;
	private int maxEven = 0;

	public LogicForList(List ml) {
		super();
		this.ml = ml;
	}

	public int getMaxOdd() {
		return maxOdd;
	}

	public int getMaxEven() {
		return maxEven;
	}

	List listOdd = new ArrayList();
	List listEven = new ArrayList();

	private void createOddAndEvenArray() {
		List listAll = ml;

		for (int i = 0; i < listAll.size(); i++) {
			int cur = (Integer) listAll.get(i);
			if (cur % 2 == 0) {
				listEven.add(cur);
				this.maxEven = cur;
			} else {
				listOdd.add(cur);
				this.maxOdd = cur;
			}
		}

	}

	private void printOddNumbers() {

		for (int i = 0; i < listOdd.size(); i++) {

			System.out.print(listOdd.get(i)+" ");
		}
	}

	private void printEvenNumbers() {

		for (int i = listEven.size() - 1; i > -1; i--) {
			
			
			System.out.print(listEven.get(i)+" ");
		}
	}

	private void printSumOddNumbers() {
		int sum = 0;
		for (int i = 0; i < listOdd.size(); i++) {
			sum += (Integer) listOdd.get(i);
		}
		System.out.println();
		System.out.println("Odd sum= " + sum);
	}

	private void printSumEvenNumbers() {
		int sum = 0;
		for (int i = listEven.size() - 1; i > -1; i--) {
			sum += (Integer) listEven.get(i);
		}
		System.out.println("Even sum= " + sum);
	}

	public void printArrays() {
		createOddAndEvenArray();
		printOddNumbers();
		System.out.println();
		printEvenNumbers();
		printSumOddNumbers();
		printSumEvenNumbers();
	}

}
