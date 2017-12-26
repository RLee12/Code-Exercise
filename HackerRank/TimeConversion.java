import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    static String timeConversion(String s) {
        String stringTime = s.substring(s.length()-2);
        String[] splitTime = s.substring(0, s.length()-2).split(":");
        if (stringTime.contains("AM")) {
            if (splitTime[0].contains("12")) {splitTime[0] = "00";}
            else {splitTime[0] = splitTime[0];}
            splitTime[1] = splitTime[1];
            splitTime[2] = splitTime[2];
        }
        else {
            if (splitTime[0].contains("12")) {splitTime[0] = splitTime[0];}
            else {splitTime[0] = Integer.toString(Integer.parseInt(splitTime[0]) + 12);}
            splitTime[1] = splitTime[1];
            splitTime[2] = splitTime[2];
        }
        return splitTime[0] + ":" + splitTime[1] + ":" + splitTime[2];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
