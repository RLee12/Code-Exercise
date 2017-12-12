import java.io.*;
import java.util.*;

public class Solution {

    static int diagSumDiff (int oneRow, int[] numArray) {
        int primaryDiag = 0;
        int secDiag = 0;
        for (int idx = 0; idx < oneRow; idx++) {
            primaryDiag += numArray[idx * (oneRow + 1)];
            secDiag += numArray[(idx + 1) *(oneRow - 1)];
        }
        if (primaryDiag - secDiag <= 0) {return -1 * (primaryDiag - secDiag);}
        else {return primaryDiag - secDiag;}
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int rowNum = n * n;
        int[] numArray = new int[rowNum];
        for (int inIdx = 0; inIdx < rowNum; inIdx++) {
            numArray[inIdx] = stdin.nextInt();
        }
        System.out.println(diagSumDiff(n, numArray));
    }
}

