package Day29;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/30-bitwise-and/tutorial
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int counter = 1;
            int result = -1;
            while(counter < n){
                for(int i = counter+1;i<=n;i++) {
                    if((counter&i) < k && (counter&i) > result)
                        result = (counter&i);
                }
                counter++;
            }
            System.out.println(result);

        }

        scanner.close();
    }
}
