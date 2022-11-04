import java.util.ArrayList;
import java.util.Scanner;

public class HRT4_JavaArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> numsList = new ArrayList<>();
        int numOfArrayLines = scanner.nextInt();

        for (int i = 0; i < numOfArrayLines; i++) {
            int line = scanner.nextInt();
            if (line != 0) {
                ArrayList<Integer> lineList = new ArrayList<>();
                for (int j = 0; j < line; j++) {
                    int currentNum = scanner.nextInt();
                    lineList.add(currentNum);
                }
                numsList.add(i, lineList);
            } else {
                numsList.add(null);
            }
        }

        int numOfIndexes = scanner.nextInt();

        for (int i = 0; i < numOfIndexes; i++) {
            int indexRow = scanner.nextInt();
            int indexCol = scanner.nextInt();

            try {
                int currentNum = numsList.get(indexRow - 1).get(indexCol - 1);
                System.out.println(currentNum);
            } catch (IndexOutOfBoundsException | NullPointerException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
Try to solve this problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need
to tell the number located in y position of x line.
Take your input from System.in.
Input Format:
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that
line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of
queries. Each query will consist of two integers x and y.
Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.
Output Format
In each line, output the number located in y position of x line. If there is no such position, just print "ERROR!"*/