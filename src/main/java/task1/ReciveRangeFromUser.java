package task1;

public class ReciveRangeFromUser {

	RangeFrom rangeFrom;
	RangeTo rangeTo;
	
	

	public ReciveRangeFromUser(RangeFrom rangeFrom, RangeTo rangeTo) {
		super();
		this.rangeFrom = rangeFrom;
		this.rangeTo = rangeTo;
	}

	public void ReciveRangeNumFromUser() {

		

		while (rangeFrom.getwasNum() == false) {
			System.out.println("Enter first number");
			rangeFrom.reciveNumber();
		}
		System.out.println(rangeFrom.getNum());

	

		boolean tmp = true;

		while (rangeTo.getwasNum() == false) {

			System.out.println("Enter Second number");
			rangeTo.reciveNumber();
		}
		System.out.println(rangeTo.getNum());
	}

	public RangeFrom getRangeFrom() {
		return rangeFrom;
	}

	

	public RangeTo getRangeTo() {
		return rangeTo;
	}

	
}
