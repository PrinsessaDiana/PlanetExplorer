package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:



public class PlanetExplorer {
	
	int location_x;
	int location_y;
	String obstacle_x;
	String obstacle_y;
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
		
		
	

	
	public String Obstacles(String obs_x, String obs_y) {
		
		obstacle_x = obs_x;
		obstacle_y = obs_y;
		
		return obstacle_x + obstacle_y;
		
		
	}
	
	
 public void setExplorerLocationHorizontal(int location_x) {
	 
	 this.location_x = location_x;
	 
 }
 
 public int getExplorerLocationHorizontal() {
	 
	 return location_x;
 }
 
 public void setExplorerLocationVertical(int location_y) {
	 
	 this.location_y = location_y;
	 
 }
 
 public int getExplorerLocationVertical() {
	 
	 return location_y;
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
		String facing = null;
		boolean face_SOUTH;
		 if (face_SOUTH = true){
			 facing = "facing SOUTH";
		 }
		boolean face_NORTH;
		boolean face_EAST;
		boolean face_WEST;
		int currentLoca_y = 0;
		int currentLoca_x = 0;
		
		//If command is f :
		if(command == "f") {
			
			currentLoca_y = location_y + 1; //currentLocation is location_y +1 
			face_SOUTH = true; // Facing south is true
			     face_EAST = false;
			     face_WEST = false;
			     face_NORTH = false;
			setExplorerLocationVertical(currentLoca_y); //Setting Explorer
			
//				System.out.print("command f" + face_SOUTH + getExplorerLocationVertical()); // Testing that test runs this "if"
		}
		
		else if(command == "r") {
			
			currentLoca_x = location_x + 1; //currentLocation is location_x +1 
			face_SOUTH = false; // Facing EAST is true
			     face_EAST = true;
			     face_WEST = false;
			     face_NORTH = false;
			setExplorerLocationHorizontal(currentLoca_x); //Setting Explorer
			
		}
		
		String currentLocation_x = Integer.toString(currentLoca_x);
		String currentLocation_y = Integer.toString(currentLoca_y);
		
		return currentLocation_x + " " + currentLocation_y + " " + facing ;
	}
}
