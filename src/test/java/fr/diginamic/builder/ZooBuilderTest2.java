package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.builder.bean.Dauphin;
import fr.diginamic.builder.bean.Lion;

public class ZooBuilderTest2 {

	@Test
	public void testAppendZone() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		Zoo zoo = zb.appendZone("Savane", 2).get();
		
		assertEquals("Le Parc Sauvage", zoo.getNom());
		assertEquals(1, zoo.getZones().size());
		assertEquals("Savane", zoo.getZones().get(0).getNom());
	}
	
	@Test
	public void testAppendAnimal() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		
		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
					    .appendAnimal("Savane", new Lion("Leo"))
					    .appendAnimal("Aquarium", new Dauphin("Flipper")).get();
			
			assertEquals(2, zoo.getZones().size());
			assertEquals("Savane", zoo.getZones().get(0).getNom());
			assertEquals("Aquarium", zoo.getZones().get(1).getNom());
			assertEquals(1, zoo.getZones().get(0).getAnimaux().size());
			assertEquals(1, zoo.getZones().get(1).getAnimaux().size());
		} catch (ZoneException e) {
			fail();
		}
	}

	@Test
	public void testAppendAnimalAvecException() {
		ZooBuilder zb = new ZooBuilder("Le Parc Sauvage");
		
		String message = null;
		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
					    .appendAnimal("Savane", new Lion("Leo")).appendAnimal("Aquarium", new Dauphin("Kiki"))
					    .appendAnimal("Aquarium", new Dauphin("Flipper")).get();
		} catch (ZoneException e) {
			message = e.getMessage();
		}
		assertEquals("La zone Aquarium est pleine.", message);
	}

}
