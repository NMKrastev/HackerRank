import java.util.Scanner;

public class HRT3_JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (num >= 2 && num <= 5 && num % 2 == 0) {
            System.out.println("Not Weird");
        } else if (num >= 6 && num <= 20 && num % 2 == 0) {
            System.out.println("Weird");
        } else if (num > 20 && num % 2 == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
/*Task
Given an integer n, perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not is weird.
Input Format:
A single line containing a positive integer n .*/