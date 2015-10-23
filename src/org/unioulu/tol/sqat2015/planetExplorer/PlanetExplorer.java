package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:



public class PlanetExplorer {
	
	
	String obstacle_x;
	String obstacle_y;
	 int [][] planetSize;
	 int planetEx_x;
	 int planetEx_y;
	

	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	
		
		
//		obstacles = obstacle_x + obstacle_y;
			
		
		
			this.planetEx_x = x;
			this.planetEx_y = y;
		
		}
		
		
	
	
	public void setPlanet (int planet[][]) {
		
		this.planetSize = planet;
		
	}
	
	public int[][] getPlanet () {
		
		return planetSize;
		
	}
	
	public String Obstacles(String obs_x, String obs_y) {
		
		obstacle_x = obs_x;
		obstacle_y = obs_y;
		
		return obstacle_x + obstacle_y;
		
		
	}
	
	
	public boolean isFacingSouth() {
		
		return true;
	}
	
	public boolean isFacingNorth() {
		return true;
	}
	
public boolean isFacingWest() {
		
		return true;
	}
	
public boolean isFacingEast() {
		return true;
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
	
		
		int [][] location = new int [planetEx_x][planetEx_y];
		
		if(command == "f") {
			
			isFacingSouth();
			planetEx_y = planetEx_y + 1;
			
			
			
		}
		
		
		return null;
	}
}
