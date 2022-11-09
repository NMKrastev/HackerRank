import java.util.InputMismatchException;
import java.util.Scanner;

public class HRT1_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
/*Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors.
The catch block contains the code that says what to do if exception occurs.
This problem will test your knowledge on try-catch block.
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers
or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.*/