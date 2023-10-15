/*
Comp352-Assignment 1
Programming Part
 Aman Singh ID: 40190387 and Mehdi Kahouache ID: 40250581 
*/
public class tailAlgorithm {

    public static void main(String[] args) {
        int k = 10; // You can change the value of k as needed
        long result = tailTetra(k);

        System.out.println("Result: " + result);
    }

    public static long tailTetra(int k) {
        return tailTetraHelper(k, 0, 0, 0, 1);
    }

    private static long tailTetraHelper(int k, int a, int b, int c, int d) {
        if (k == 0) {
            return a;
        } else if (k == 1) {
            return b;
        } else if (k == 2) {
            return c;
        } else if (k == 3) {
            return d;
        } else {
            return tailTetraHelper(k - 1, b, c, d, a + b + c + d);
        }
    }
}

