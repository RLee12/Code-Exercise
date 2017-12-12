import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static long[] getSum(long[] inputArray) {
        long numMin = 0;
        long numMax = 0;
        if (inputArray[0] >= inputArray[1]) {numMin = inputArray[1]; numMax = inputArray[0];}
        if (inputArray[0] <= inputArray[1]) {numMin = inputArray[0]; numMax = inputArray[1];}
        long tempSum = 0;
        for (int idx = 2; idx < 5; idx++) {
            if (inputArray[idx] < numMin) {
                tempSum += numMin;
                numMin = inputArray[idx];
            }
            else if (inputArray[idx] > numMax) {
                tempSum += numMax;
                numMax = inputArray[idx];
            }
            else {tempSum += inputArray[idx];}
        }
        long[] sumArray = new long[2];
        sumArray[0] = tempSum + numMin;
        sumArray[1] = tempSum + numMax;
        return sumArray;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long[] sumArray = getSum(arr);
        System.out.printf("%d %d", sumArray[0], sumArray[1]);
    }
}
