import java.util.Scanner;

public class HRT2_JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        S = S.substring(start, end);
        System.out.println(S);
    }
}
/*Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive
range from start to end - 1. You'll find the String class' substring method helpful in completing this challenge.
Input Format:
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.
Output Format:
Print the substring in the inclusive range from start to end - 1.*/