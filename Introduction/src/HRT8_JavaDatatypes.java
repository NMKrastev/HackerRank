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
