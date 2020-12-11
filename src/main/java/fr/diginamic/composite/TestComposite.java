package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		Service dsin = new Service("DSIN");
		dsin.add(new Personne("Cécile", "RASPEY", 10000)).add(new Personne("Bilel", "BEKCHAR", 8000));
		dsin.add(new Service("Big Data").add(new Personne("JB", "RMANEY", 7500)).add(new Personne("Jane", "DOE", 3500)));
		dsin.add(new Service("Java Dev").add(new Personne("Kevin", "GUINEAU", 7500)).add(new Personne("Paul", "MARTIN", 3500)));
		
		System.out.println(dsin.calculerSalaire());
		
	}

}
