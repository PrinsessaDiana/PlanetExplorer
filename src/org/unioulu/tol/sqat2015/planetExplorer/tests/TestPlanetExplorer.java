package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void test() {
	
		PlanetExplorer pe = new PlanetExplorer(0, 0, null);
		
		
		pe.SetPlanet(6, 6);
		
		System.out.print(pe.GetPlanet());
		
		
		
	}
}
