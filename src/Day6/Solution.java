package Day6;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        // scan.nextLine();
        for(int i = 0;i<=T;i++){
            String S = scan.next();
            for(int n=0; n<S.length();n++){
                if(n%2==0){
                    System.out.print(S.charAt(n));
                }
            }
            System.out.print(" ");
            for (int n = 0; n < S.length(); n++) {
                if (n % 2 == 1) {
                    System.out.print(S.charAt(n));
                }
            }
            System.out.println("");
        }
        scan.close();
    }
}
