import java.util.Scanner;

public class HRT1_JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A + " " + B);

    }
}
/*The elements of a String are called characters. The number of characters in a String is called the length,
and it can be retrieved with the String.length() method.
Given two strings of lowercase English letters, A and B, perform the following operations:
- Sum the lengths A of B and .
- Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format:
The first line contains a string A. The second line contains another string B.
The strings are comprised of only lowercase English letters.
Output Format:
There are three lines of output:
For the first line, sum the lengths A of B and .
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.*/