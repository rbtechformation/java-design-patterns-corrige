package fr.diginamic.configuration;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.diginamic.singleton.Configuration;

public class ConfigurationTest {

	@Test
	public void testGetInstance() {
		String value = Configuration.getInstance().getUrl();
		assertEquals("jdbc:mysql://localhost:3306/mabase", value);
		
		value = Configuration.getInstance().getUser();
		assertEquals("root", value);
		
		value = Configuration.getInstance().getPassword();
		assertEquals("1234", value);
	}

}
