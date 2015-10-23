package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void test() {
	
		PlanetExplorer pe = new PlanetExplorer(6, 6, null);
		
		
		
		
		int location_x = 0;
		int location_y = 0;
		
		
		String command_f = "f";
		String command_r = "r";
		
		pe.executeCommand(command_f);
		pe.executeCommand(command_r);
		assertEquals(location_y, pe.getExplorerLocationVertical());
		assertEquals(location_x, pe.getExplorerLocationHorizontal());
	
	}
}
