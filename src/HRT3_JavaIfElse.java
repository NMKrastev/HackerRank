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
