package task1;

import java.util.Scanner;

public class GetNumerFromClient {

	private boolean wasNum = false;
	private int num = 0;

	public void reciveNumber() {
		wasNum = false;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			this.num = sc.nextInt();
			wasNum = true;

		}
	}

	public int getNum() {

		return num;
	}

	public boolean getwasNum() {

		return wasNum;
	}

}
