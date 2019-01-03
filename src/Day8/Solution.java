package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
public class Solution {
    public static void main(String []argh){
        Map<String,Integer> phonebook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            System.out.println(phonebook.containsKey(s) ? s+"="+phonebook.get(s) : "Not found");
        }
        in.close();
    }
}
