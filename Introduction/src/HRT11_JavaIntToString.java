import java.util.Scanner;

public class HRT11_JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= -100 && n <= 100) {
            String s = String.valueOf(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
/*You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s
the code will print "Good job". Otherwise it will print "Wrong answer".
n can range between -100 to 100 inclusive.*/