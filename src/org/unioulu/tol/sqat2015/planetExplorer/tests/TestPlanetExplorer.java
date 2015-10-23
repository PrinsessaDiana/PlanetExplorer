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
		String command_l = "l";
		String command_d = "d";
		
		pe.executeCommand(command_f);
		pe.executeCommand(command_r);
		assertEquals(1, pe.getExplorerLocationVertical());
		assertEquals(1, pe.getExplorerLocationHorizontal());
		pe.executeCommand(command_f);
		pe.executeCommand(command_r);
		assertEquals(2, pe.getExplorerLocationVertical());
		assertEquals(2, pe.getExplorerLocationHorizontal());
		pe.executeCommand(command_l);
		assertEquals(2, pe.getExplorerLocationVertical());
		assertEquals(1, pe.getExplorerLocationHorizontal());
		pe.executeCommand(command_l);
		
		assertEquals(1, pe.getExplorerLocationHorizontal());
	}
}
