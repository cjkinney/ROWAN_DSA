import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//runs the KnightsTour class
		System.out.println("Welcome to The Knight's Tour Solution Calculator. \n"
				+ "Enter a board size greater than three: ");
		int num = scn.nextInt();
		KnightsTour kt = new KnightsTour(num);
		kt.solveKT();
		
		//runs the PostFixCalc class
		System.out.println("This is the PostFix Calculator. \n"
				+ "Enter an equation with no spaces: ");
		String eq = scn.nextLine();
		//notetoself: continue from here after PostFixCalc has a constructor
		
		//runs the InFixCalc class
		System.out.println("This is the InFix Calculator. \n"
				+ "Enter an equation with no spaces: ");
		String form = scn.nextLine();
		//notetoself: continue from here after InFixCalc has a constructor
	}

}
