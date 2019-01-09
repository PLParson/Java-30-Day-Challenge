package Day26;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-nested-logic/problem
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int[][] returnDate = new int[3][3];
        for (int i = 0;i<3;i++)
            returnDate[0][i] = in.nextInt();
        for (int i = 0;i<3;i++)
            returnDate[1][i] = in.nextInt();
        in.close();
        int fine = returnDate[0][0]<=returnDate[1][0]&&returnDate[0][1]<=returnDate[1][1]&&returnDate[0][2]<=returnDate[1][2]?0
                :returnDate[0][0]>returnDate[1][0]&&returnDate[0][1]==returnDate[1][1]&&returnDate[0][2]==returnDate[1][2]?15*(returnDate[0][0]-returnDate[1][0])
                :returnDate[0][1]>returnDate[1][1]&&returnDate[0][2]==returnDate[1][2]?500*(returnDate[0][1]-returnDate[1][1])
                :returnDate[0][2]>returnDate[1][2]?10000:0;
        System.out.print(fine);
    }
}
