import java.util.*;
public class W2E2Laput {
public static void main (String [] args) {
	
	 int[][] laputmatrix = {
	            {0, 1, 1, 0},
	            {1, 1, 0, 0},
	            {0, 0, 1, 1},
	            {1, 1, 1, 1}
	        };

	        int laputzeros = 0;
	        int laputones = 0;
	        int laputmaxOnes = 0;
	        int laputmaxRow = 0;

	        for (int row = 0; row < 4; row++) {
	            int rowOnes = 0;

	            for (int col = 0; col < laputmatrix[row].length; col++) {
	                System.out.print(laputmatrix[row][col] + " ");

	                if (laputmatrix[row][col] == 0) {
	                    laputzeros++;
	                } else {
	                    laputones++;
	                    rowOnes++;
	                }
	            }

	            if (rowOnes > laputmaxOnes) {
	                laputmaxOnes = rowOnes;
	                laputmaxRow = row;
	            }

	            System.out.println();
	        }

	        System.out.println("Number of Zeros: " + laputzeros);
	        System.out.println("Number of Ones: " + laputones);
	        System.out.println("Number of row with the most Ones is row " 
	                + (laputmaxRow + 1));
	    }
	}
	
	
	

