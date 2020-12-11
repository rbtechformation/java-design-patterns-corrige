package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.builder.bean.Zone;

public class Zoo {

	private String nom;
	private List<Zone> zones;
	
	Zoo(String nom) {
		this.nom = nom;
		zones = new ArrayList<>();
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
	 * @return the zones
	 */
	public List<Zone> getZones() {
		return zones;
	}
	/** Setter
	 * @param zones the zones to set
	 */
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
}
