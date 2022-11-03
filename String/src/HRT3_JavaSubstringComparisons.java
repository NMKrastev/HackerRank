import java.util.Scanner;

public class HRT3_JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        String currentSubstring = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //welcometojava
        for (int i = 0; i < s.length(); i++) {
            if (i + k <= s.length()) {
                //wel
                currentSubstring = s.substring(i, i + k);
            } else {
                break;
            }
            if (currentSubstring.compareTo(smallest) <= 0) {
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }
        return smallest + "\n" + largest;
    }
}
/*Given a string, s, and an integer, k, complete the function so that it finds the lexicographically
smallest and largest substrings of length k.
Function Description
Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
- string s: a string
- int k: the length of the substrings to find
Returns
string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.*/