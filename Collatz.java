// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int seed = Integer.parseInt(args[0]);
	char type = args[1].charAt(0);
	int x;
	int count;

	for (int i = 1; i <= seed ; i++) {				//running for every number 1 --> seed
		x = i;
		count = 1;
		if (type == 'v') {
			System.out.print( x + " " );
		}

		do {										// "do while" - so that for index i=1 will still run
			if (x % 2 == 0)  { x /= 2;        }
			else	   	     { x = x * 3 + 1; }

			if (type == 'v') {
				System.out.print( x + " " );
			}
			count ++;
		} while ( x != 1 );								//for each number until x is 1
		
		if (type == 'v')
			System.out.println( "(" + count + ")" );
	}													//back to "for" for the next seed

	System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
}
}