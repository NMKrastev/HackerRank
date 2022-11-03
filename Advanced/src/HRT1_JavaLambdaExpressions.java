import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static boolean isPrime(int a){
        for(int i = 2; i <= Math.sqrt(a); i++)
            if(a % i == 0)
                return false;
        return true;
    }
    public static  PerformOperation isOdd(){
        return (int a) -> (a % 2 != 0);
    }
    public static PerformOperation isPrime(){
        return (int a) -> isPrime(a);
    }
    public static PerformOperation isPalindrome(){
        return (int a) -> (a+"").equals(new StringBuffer(a+"").reverse().toString());
    }
}

public class HRT14_JavaLambdaExpressions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = MyMath.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = MyMath.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = MyMath.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}
/*This Java 8 challenge tests your knowledge of Lambda expressions!
Write the following methods that return a lambda expression performing a specified action:
PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
Input Format
Input is handled for you by the locked stub code in your editor.
Output Format
The locked stub code in your editor will print T lines of output.
Sample Input
The first line contains an integer, T (the number of test cases).
The T subsequent lines each describe a test case in the form of 2 space-separated integers:
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome).
The second integer denotes the number to be checked.*/