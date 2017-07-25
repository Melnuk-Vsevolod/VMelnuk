package task1;

import java.util.ArrayList;
import java.util.List;

public class MakeList {

	RangeFrom rF;
	RangeTo rT;
	private List listAllNumInRange = new ArrayList();

	public MakeList(RangeFrom rF, RangeTo rT) {
		super();
		this.rF = rF;
		this.rT = rT;
	}

	public MakeList() {

	}

	public List getListAllNumInRange() {
		return listAllNumInRange;
	}

	public List createList() {

		if (BoundariesofArrayAreTheSame()) {
			listAllNumInRange.add(rF.getNum());

		} else {

			if (isToBiggerThenFromBoundariesofArray()) {
				int currentNumber = rF.getNum();
				for (int i = rF.getNum(); i < rT.getNum() + 1; i++) {
					listAllNumInRange.add(currentNumber);
					currentNumber++;
				}

			} else {
				int currentNumber = rT.getNum();
				for (int i = rT.getNum(); i < rF.getNum() + 1; i++) {
					listAllNumInRange.add(currentNumber);
					currentNumber++;
				}
			}
		}
		return listAllNumInRange;
	}

	private boolean isToBiggerThenFromBoundariesofArray() {

		if (rF.getNum() < rT.getNum()) {
			return true;
		}
		return false;

	}

	private boolean BoundariesofArrayAreTheSame() {

		if (rF.getNum() == rT.getNum()) {
			return true;
		}
		return false;

	}

}
