package BasicPrograms;
	// Java program to find N-th Harmonic Number
	 
	import java.io.*;
	 
	public class HarmonicNumber {
	// Function to find N-th Harmonic Number
	static double nthHarmonic(int N)
	{
	    // H1 = 1
	    float harmonic = 1;
	 
	    // loop to apply the forumula
	    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
	    //H1 = 1. H2 = H1 + 1/2. H3 = H2 + 1/3. 
	    for (int i = 2; i <= N; i++) {
	        harmonic += (float)1 / i;
	    }
	 
	    return harmonic;
	}
	 
	// Driver Code
	 
	    public static void main (String[] args) {
	            int N = 8;
	     
	    System.out.print(nthHarmonic(N));
	     
	    }
	}


