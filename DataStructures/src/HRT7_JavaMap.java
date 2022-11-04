import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HRT7_JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> phoneBookMap = new LinkedHashMap<>();

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String name = scanner.nextLine();
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            phoneBookMap.putIfAbsent(name, phoneNumber);
            phoneBookMap.put(name, phoneNumber);
        }

        while (scanner.hasNext()) {
            String search = scanner.nextLine();

            if (phoneBookMap.containsKey(search)) {
                System.out.printf("%s=%d\n", search, phoneBookMap.get(search));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
/*You are given a phone book that consists of people's names and their phone number. After that you will be given some
person's name as query. For each query, print the phone number of that person.
Input Format:
The first line will have an integer n denoting the number of entries in the phone book.
Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name'
or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
Output Format:
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name
and phone number. See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor.
You can either complete that code or write completely on your own.*/