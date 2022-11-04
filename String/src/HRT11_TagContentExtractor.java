import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HRT11_TagContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexPattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regexPattern);

        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {

            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean findMatch = true;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                findMatch = false;
            }
            if (findMatch) {
                System.out.println("None");
            }
        }
    }
}
/*In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like
<tag>contents</tag>. Note that the corresponding end tag starts with a /.
Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within
sequences of well-organized tags meeting the following criterion:
- The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text
starts with an h1 tag and ends with a non-matching h2 tag.
- Tags can be nested, but content between nested tags is considered not valid. For example, in
<h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
- Tags can consist of any printable characters.
Input Format:
The first line of input contains a single integer, N (the number of lines).
The N subsequent lines each contain a line of text.
Constraints:
Each line contains a maximum of 10^4 printable characters.
The total number of characters in all test cases will not exceed 10^6.
Output Format:
For each line, print the content enclosed within valid tags.
If a line contains multiple instances of valid content, print out each instance of valid content on a new line;
if no valid content is found, print None.*/