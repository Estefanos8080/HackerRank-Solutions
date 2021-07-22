import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int x = 1; x <= 10; x++){
            String str1 = Integer.toString(x);
            String str2 = Integer.toString(N);
            System.out.println(str2 + " x " + str1 + " = " + N * x);
        }

        bufferedReader.close();
    }
}

