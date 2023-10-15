/*
Comp352-Assignment 1
Programming Part
 Aman Singh ID: 40190387 and Mehdi Kahouache ID: 40250581 
*/

import java.io.*;


public class LinearTetra {
    

    public static long[] linearTetra(int k) {
        

        long[] A = new long[4];
        long i = 0, j = 0, z = 0, m = 0;

        if (k == 0 || k==1 || k==2) {
            
            A[0] = i; A[1] = j; A[2] = z ; A[3] = m;
			//System.out.print((i+j+z+m) + " ");
			
			return (A);

        } else if (k == 3) {
            
            i = 1;
            
            A[0] = i; A[1] = j; A[2]= z ; A[3]= m;
			//System.out.print(m + " " + z + " " + j + " " + i + " ");
			
			return (A);

        } else {
            A = linearTetra(k - 1);
            i = A[0];
            j = A[1];
            z = A[2];
            m = A[3];
            //System.out.print((i + j + z + m) + " "); up to kth element 0 0 0 1 1 2 ex: k=5
            A[0] = i + j + z + m;
            A[1] = i;
            A[2] = j;
            A[3] = z;

            return A; //(i+j+z+m,i,j,z)
        }

        

        
    }

    public static void main(String[] args) throws IOException{
        // int k = 5; // Change this value to generate series up to a different number
        // long[] Array = new long[4];
        // Array =  linearFib(k);
        // System.out.println("Ans: " + Array[0]);

        FileWriter fw1 = new FileWriter("LinearTetraOut.txt");
        FileWriter fw2 = new FileWriter("LinearTetraTime.txt");

        for(int i = 5; i<=200 ; i+=5)
        {
            long begin = System.nanoTime();
            long[] Array = new long[4];
            Array = linearTetra(i);
            System.out.println("Tetra of "+i+ " = " + Array[0]);
            long end = System.nanoTime();
            long timeTaken = end - begin;

            fw1.write("\nTetranacci of "+i+ " = " + Array[0]);
            fw2.write("\n time of Tetranacci of "+i+ " = " + timeTaken + " ns");

        }
        fw1.close();
        fw2.close();
        
    }
}
