import java.util.Scanner;

public class HRT10_ValidUsernameRegularExpression {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- != 0) {
            String userName = scanner.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {

    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
/*You are updating the username policy on your company's internal networking platform. According to the policy,
a username is considered valid if all the following constraints are satisfied:
The username consists of 8 to 30 characters inclusive. If the username consists of less than  or greater than  characters,
then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the
character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
The first character of the username must be an alphabetic character, i.e.,
either lowercase character [a-z] or uppercase character [A-Z].
Update the value of regularExpression field in the UsernameValidator class so that the regular expression
only matches with valid usernames.
Input Format
The first line of input contains an integer n, describing the total number of usernames. Each of the next n lines
contains a string describing the username. The locked stub code reads the inputs and validates the username.
Constraints
The username consists of any printable characters.
Output Format
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.*/
