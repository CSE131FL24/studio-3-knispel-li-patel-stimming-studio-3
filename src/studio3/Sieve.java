package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] numbers = {n};
		int i;
		boolean [] prime = new boolean [n+1];
		for ( i = 0 ; i< n+1; i++) {
		prime [i] = true;
		}
		 for (i=2 ; i < n; i++) {
			if (prime [i] == true) {
				for (int j = (int) Math.pow(i, 2); j < n; j=j+i) {
					prime [j] = false;
	}

	}
			if (prime [i] == true) {
				System.out.println( i );
			}		
}

}
}