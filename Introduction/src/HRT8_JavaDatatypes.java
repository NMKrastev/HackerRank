import java.util.Scanner;

public class HRT8_JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLoops = scanner.nextInt();

        for (int i = 0; i < numOfLoops; i++) {

            try {
                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= -128 && number <= 127) {
                    System.out.println("* byte");
                }
                if ( number >= -32768 && number <= 32767) {
                    System.out.println("* short");
                }
                if (number >= -2147483648 && number <= 2147483647) {
                    System.out.println("* int");
                }
                if (number >= -9223372036854775808L && number <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
To get you started, a portion of the solution is provided for you in the editor.
Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
Input Format:
The first line contains an integer n , denoting the number of test cases.
Each test case n, is comprised of a single line with an integer number, which can be arbitrarily large or small.
Output Format:
For each input variable number and appropriate primitive dataType, you must determine if the given primitives
are capable of storing it. If yes, then print:*/