package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void test() {
	
		PlanetExplorer pe = new PlanetExplorer(0, 0, null);
		
		int [][] planet = new int [6][6];
		
		pe.setPlanet(planet);
		
		System.out.print(pe.getPlanet());
		
		String command = "f";
		
		pe.executeCommand(command);
		
		assertEquals(pe.isFacingSouth(), true);
		
	}
}
