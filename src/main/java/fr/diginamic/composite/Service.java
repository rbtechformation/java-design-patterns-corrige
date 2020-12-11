package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service implements IElement {

	private String nom;
	private List<IElement> elements = new ArrayList<>();
	
	public Service(String nom) {
		super();
		this.nom = nom;
	}
	
	public Service add(IElement element) {
		elements.add(element);
		return this;
	}
	
	public Service add(IElement... elements) {
		this.elements.addAll(Arrays.asList(elements));
		return this;
	}
	
	@Override
	public double calculerSalaire() {
		return elements.stream().mapToDouble(e -> e.calculerSalaire()).sum();
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
	 * @return the elements
	 */
	public List<IElement> getElements() {
		return elements;
	}
	/** Setter
	 * @param elements the elements to set
	 */
	public void setElements(List<IElement> elements) {
		this.elements = elements;
	}

}
