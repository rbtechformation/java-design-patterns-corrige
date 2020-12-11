package fr.diginamic.builder.bean;

import java.util.ArrayList;
import java.util.List;

public class Zone {

	private String nom;
	private int capacite;
	private List<Animal> animaux;
	
	public Zone(String nom, int capacite) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.animaux = new ArrayList<>();
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

	/** Getter
	 * @return the capacite
	 */
	public int getCapacite() {
		return capacite;
	}

	/** Setter
	 * @param capacite the capacite to set
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	/** Getter
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/** Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
}
