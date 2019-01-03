package Day14;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-scope/problem
 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        int max = 0;
        for(int val1 : elements){
            for(int val2 :elements){
                max = Math.abs(val1 - val2) > max ? Math.abs(val1 - val2) : max;
            }
        }
        maximumDifference = max;
    }

} // End of Difference class

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
