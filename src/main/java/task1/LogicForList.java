package task1;

import java.util.ArrayList;
import java.util.List;

public class LogicForList {

	MakeList ml = new MakeList();
	List listOdd = new ArrayList();
	List listEven = new ArrayList();

	private void createOddAndEvenArray() {
		List listAll = ml.getListAllNumInRange();

		for (int i = 0; i < listAll.size(); i++) {
			int cur = (Integer) listAll.get(i);
			if (cur % 2 == 0) {
				listEven.add(cur);
			} else {
				listOdd.add(cur);
			}
		}

	}

	public void printOddNumbers() {
		for (int i = 0; i < listOdd.size(); i++) {
			System.out.println(listOdd.get(i));
		}
	}

	public void printEvenNumbers() {
		for (int i = listEven.size(); i > -1; i--) {
			System.out.println(listEven.get(i));
		}
	} 

	public void printSumOddNumbers() {
		int sum = 0;
		for (int i = 0; i < listOdd.size(); i++) {
			sum += (Integer) listOdd.get(i);
		}
		System.out.println(sum);
	}

	public void printSumEvenNumbers() {
		int sum = 0;
		for (int i = listEven.size(); i > -1; i--) {
			sum += (Integer) listEven.get(i);
		}
		System.out.println(sum);
	}

}
