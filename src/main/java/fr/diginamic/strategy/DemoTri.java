package fr.diginamic.strategy;

public class DemoTri {

	public static void main(String[] args) {
		Tri tri = new Tri();
		
		Integer[] array1 = {12, -5, 7, 0, 8, 4, -3, 9, 15};
		tri.exec(array1);
	
		tri.setStrategieTri(2);
		tri.exec(array1);
		
		tri.setStrategieTri(3);
		tri.exec(array1);
	}

}
