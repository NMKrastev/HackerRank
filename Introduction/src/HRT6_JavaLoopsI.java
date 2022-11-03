import java.util.Scanner;

public class HRT6_JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
/*In this challenge, we're going to use loops to help us do some simple math.
Task
Given an integer N , print its first 10 multiples. Each multiple N * i (where 1 <= i <= 10)
should be printed on a new line in the form: N x i = result.
Input Format:
A single integer N.
Constraints:
2 <= N <= 20
Output Format:
Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N in the form:
N x i = result.*/