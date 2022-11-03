import java.util.Scanner;

public class HRT4_JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder reverse = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            reverse.append(A.charAt(i));
        }

        if (reverse.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.
Constraints:
- A will consist at most 50 lower case english letters.*/