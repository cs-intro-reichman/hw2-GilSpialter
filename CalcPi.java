// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int denom = 1;
		double sum = 0.0;
		int q = 1;

		for (int i = 0; i < n; i++) {
			sum += (1.0 / denom * q);
			denom += 2;
			q *= (-1);
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
