package task1;

public class ReciveRangeFromUser {

	public void ReciveRangeFromUser() {

		RangeFrom rangeFrom = new RangeFrom();

		while (rangeFrom.getwasNum() == false) {
			System.out.println("Enter first number");
			rangeFrom.reciveNumber();
		}
		System.out.println(rangeFrom.getNum());

		RangeTo rangeTo = new RangeTo();

		boolean tmp = true;

		while (rangeTo.getwasNum() == false) {

			System.out.println("Enter Second number");
			rangeTo.reciveNumber();
		}
		System.out.println(rangeTo.getNum());
	}
}
