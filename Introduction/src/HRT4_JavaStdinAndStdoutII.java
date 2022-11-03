import java.util.Scanner;

public class HRT4_JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double numDouble = Double.parseDouble(scanner.nextLine());
        String text = scanner.nextLine();

        // Write your code here.

        System.out.println("String: " + text);
        System.out.println("Double: " + numDouble);
        System.out.println("Int: " + num);
    }
}
/*In this challenge, you must read an integer, a double, and a String from stdin, then print the values according
to the instructions in the Output Format section below. To make the problem a little easier, a portion of the
code is provided for you in the editor.
Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
Input Format:
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format:
There are three lines of output:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.*/