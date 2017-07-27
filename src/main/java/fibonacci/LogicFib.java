package fibonacci;

import java.util.List;

public class LogicFib {

	// Program build “Fibonacci” numbers: F1 will be the biggest odd number and
	// F2 – the biggest even number, user can enter the size of set (N);
	// Program prints percentage of odd and even Fibonacci numbers;

	private UserSetSizeFib size;
	private List listAllFibNum;

	F1 f1 = new F1(0);
	F2 f2 = new F2(0);

	public LogicFib(int maxOdd, int maxEven) {
		super();
		this.f1.setNum(maxOdd);
		this.f2.setNum(maxEven);
		System.out.println(f1.getNum() + "------" + f2.getNum());

	}

	public F1 getF1() {
		return f1;
	}

	public void setF1(F1 f1) {
		this.f1 = f1;
	}

	public F2 getF2() {
		return f2;
	}

	public void setF2(F2 f2) {
		this.f2 = f2;
	}

	public UserSetSizeFib getSize() {
		return size;
	}

	public void setSize(UserSetSizeFib size) {
		this.size = size;
	}

	private void fibNumToList() {
		if (f1.getNum() < f2.getNum()) {
			System.out.println(f1.getNum() + "<------>" + f2.getNum());
			listAllFibNum.add(f1.getNum());
			listAllFibNum.add(f2.getNum());

			for (int i = 0; i < size.getNum(); i++) {
				int temp = f1.getNum();

				f1.setNum(f2.getNum());
				f2.setNum(f1.getNum() + temp);

				listAllFibNum.add(f2);
			}

		} else {
			System.out.println(f1.getNum() + "<------?" + f2.getNum());

			listAllFibNum.add(f2.getNum());
			listAllFibNum.add(f1.getNum());

			for (int i = 0; i < size.getNum(); i++) {
				int temp = f2.getNum();

				f2.setNum(f1.getNum());
				f1.setNum(f2.getNum() + temp);

				listAllFibNum.add(f1);

			}
		}

	}

	private void printPersOddAndEven() {
		int amountOdd = 0;
		int amountEven = 0;

		for (int i = 0; i < listAllFibNum.size(); i++) {
			int tmp = (Integer) listAllFibNum.get(i);
			if (tmp % 2 == 0) {
				amountEven++;
			} else {
				amountOdd++;
			}

		}
		int sum = amountOdd + amountEven;

		System.out.println("Odd= " + amountOdd * 100 / sum + "%, " + "Even= " + amountEven * 100 / sum + "%, ");
	}

	public void printPersentege() {
		fibNumToList();
		printPersOddAndEven();

	}

	// private void find maxNum(){
	//
	//
	// }

}
