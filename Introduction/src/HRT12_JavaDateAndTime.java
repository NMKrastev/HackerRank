import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class HRT12_JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String dayOfWeek;
        System.out.println(dayOfWeek = getDay(month, day, year));

    }

    private static String getDay(int month, int day, int year) {

        Calendar calendar = new GregorianCalendar(year, month-1, day);
        return calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG, Locale.US).toUpperCase();
    }
}
/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time
and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the
calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method getDay, which returns the day on that date.
The method should return  as the day on that date.
Function Description:
Complete the findDay function in the editor below.
findDay has the following parameters:
int: month
int: day
int: year
Returns
string: the day of the week in capital letters
Input Format
A single line of input containing the space separated month, day and year, respectively, in MM/DD/YYYY format.*/