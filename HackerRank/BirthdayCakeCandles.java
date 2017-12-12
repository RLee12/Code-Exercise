import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int maxHeight = ar[0];
        int highCount = 0;
        for (int idx = 1; idx < n; idx++) {
            if (ar[idx] > maxHeight) {
                maxHeight = ar[idx];
            }
        }
        for (int idx = 0; idx < n; idx++) {
            if (maxHeight == ar[idx]) {
                highCount += 1;
            }
        }
        return highCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
