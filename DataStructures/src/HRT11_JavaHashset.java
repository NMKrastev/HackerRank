import java.util.Scanner;
import java.util.*;

public class HRT11_JavaHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        Set<String> pairSet = new HashSet<>();
        String names = "";
        int count = 0;

        for (int i = 0; i < t; i++) {
            names = pair_left[i] + " " + pair_right[i];
            if (pairSet.add(names)){
                count++;
            }

            System.out.println(count);
        }
    }
}
/*In computer science, a set is an abstract data type that can store certain values, without any particular order,
and no repeated values(Wikipedia). {1,2,3} is an example of a set, but {1,2,3} is not a set.
Today you will learn how to use sets in java by solving this problem.
You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a = c and b = d.
That also implies (a,b) is not same as (b,a).
After taking each pair as input, you need to print number of unique pairs you currently have.
Complete the code in the editor to solve this problem.
Input Format:
- In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will
contain two strings seperated by a single space.
Constraints:
- Length of each string is atmost 5 and will consist lower case letters only.
Output Format
Print T lines. In the i-th line, print number of unique pairs you have after taking i-th pair as input.*/