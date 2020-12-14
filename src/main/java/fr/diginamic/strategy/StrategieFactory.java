package fr.diginamic.strategy;

public class StrategieFactory {

	public static TriStrategie getInstance(int type) {
		if (type==1) {
			return new BubbleSortStrategie();
		}
		else if (type==2) {
			return new InsertionSortStrategie();
		}
		else {
			return new SelectionSortStrategie();
		}
	}
}
