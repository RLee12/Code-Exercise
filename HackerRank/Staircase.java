import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int size = stdin.nextInt();
        for (int idx = 1; idx <= size; idx++) {
          System.out.printf(String.join("", Collections.nCopies(size - idx, " ")) 
                            + String.join("", Collections.nCopies(idx, "#")) 
                            + "\n");
        }
    }
}
