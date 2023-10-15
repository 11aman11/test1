import java.io.*;

/*
Comp352-Assignment 1
Programming Part
 Aman Singh ID: 40190387 and Mehdi Kahouache ID: 40250581 
*/

public class MultipleTetra {
    

    public static long multipleTetra(int k) {
        
        if (k <=2)
            return 0;
        else if (k == 3) 
            return 1;
        else {
            return multipleTetra(k-1)+multipleTetra(k-2)+multipleTetra(k-3)+multipleTetra(k-4); 
        }

        

        
    }

    public static void main(String[] args) throws IOException{

        FileWriter fw1 = new FileWriter("MultipleTetraOut.txt");
        FileWriter fw2 = new FileWriter("MultipleTetraTime.txt");

        for(int i = 5; i<=40 ; i+=5)
        {
            long begin = System.nanoTime();
            long Ans = multipleTetra(i);
            
            System.out.println("Tetra of "+i+ " = " + Ans);
            long end = System.nanoTime();
            long timeTaken = end - begin;

            fw1.write("\nTetranacci of "+i+ " = "+ Ans);
            fw2.write("\n time of Tetranacci of "+i+ " = " + timeTaken + " ns");

        }
        fw1.close();
        fw2.close();
        
    }
}