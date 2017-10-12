/**
 * A solution to the knights tour problem that
 * generates an N x N grid.
 * 
 * @author Christopher Kinney
 */
public class KnightsTour {
	//attributes
	public int n;
	
	//Default Constructor for KnightsTour
	public KnightsTour() {
		n = 8;
	}
	
	//Constructor for KnightsTour that solves for an
	//N x N board
	public KnightsTour(int num){
		n = num;
	}
	
	//Checks if a space on the board is free, or valid.
	public boolean spaceFree(int x, int y, int sol[][]) {
		return (x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
	}
	
	//
	public boolean solveKT() {
		return false;
	}
}
