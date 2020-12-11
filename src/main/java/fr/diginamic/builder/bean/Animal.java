package fr.diginamic.builder.bean;

public abstract class Animal {

	private String nom;
	
	public Animal(String nom) {
		super();
		this.nom = nom;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
