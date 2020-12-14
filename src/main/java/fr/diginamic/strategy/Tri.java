package fr.diginamic.strategy;

public class Tri {
	
	private TriStrategie strategie = new BubbleSortStrategie();

	public void exec(Integer[] arr) {
		
		strategie.trier(arr);
	}
	
	public void setStrategieTri(int typeTri) {
		strategie = StrategieFactory.getInstance(typeTri);
	}
}
