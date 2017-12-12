import java.io.*;
import java.util.*;

public class Solution {

    static double[] getFracArray(int size, double[] inputArray) {
        double posFrac = 0;
        double negFrac = 0;
        double zeroFrac = 0;
        double[] fracArray = new double[3];
        for (int idx = 0; idx < size; idx++) {
            if (inputArray[idx] > 0) {posFrac += 1;}
            else if (inputArray[idx] < 0) {negFrac += 1;}
            else zeroFrac += 1;
        }
        fracArray[0] = posFrac / size;
        fracArray[1] = negFrac / size;
        fracArray[2] = zeroFrac / size;
        return fracArray;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int size = stdin.nextInt();
        double[] inputArray = new double[size];
        for (int idx = 0; idx < size; idx++) {
            inputArray[idx] = stdin.nextInt();
        }
        double[] fracArray = getFracArray(size, inputArray);
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(fracArray[idx]);
        }
    }
}
