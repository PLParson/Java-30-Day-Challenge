package Day25;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0;i<n;i++) {
            int t = in.nextInt();
            if (isPrime(t)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        in.close();
    }
    public static boolean isPrime(int p){
        if(p == 1)
            return false;
        if(p == 2)
            return true;
        for (int i = 2; i*i<=p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
