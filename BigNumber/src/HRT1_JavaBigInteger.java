import java.math.BigInteger;
import java.util.Scanner;

public class HRT1_JavaBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    }
}
/*In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them
in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.
Input Format:
There will be two lines containing two numbers, a and b.
Constraints:
a and b are non-negative integers and can have maximum 200 digits.
Output Format:
Output two lines. The first line should contain a + b, and the second line should contain a * b.
Don't print any leading zeros.*/