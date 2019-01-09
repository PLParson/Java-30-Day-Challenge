package Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/30-regex-patterns/problem
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[N];
        int count = 0;

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Pattern p = Pattern.compile("[a-z]+(@gmail.com)$");
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                arr[count] = firstName;
                count++;
            }
        }
        scanner.close();
        List<String> list = new ArrayList<>();

        for(String s : arr) {
            if(s != null && s.length() > 0) {
                list.add(s);
            }
        }
        arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        for (String name : arr)
            System.out.println(name);

    }
}
