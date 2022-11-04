import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRT6_JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numsList = new ArrayList<>();

        int listSize = scanner.nextInt();

        for (int i = 0; i < listSize; i++) {
            int currentNum = scanner.nextInt();
            numsList.add(currentNum);
        }

        int numOfQueries = scanner.nextInt();

        for (int i = 0; i < numOfQueries; i++) {

            String input = scanner.next();
            int index = scanner.nextInt();
            if (input.equals("Insert")) {
                int num = scanner.nextInt();
                numsList.add(index, num);
            } else {
                numsList.remove(index);
            }
        }

        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
/*For this problem, we have 2 types of queries you can perform on a List:
Insert y at index x:
Insert
x y
Delete the element at index x:
Delete
x
Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed,
print the modified list as a single line of space-separated integers.
Input Format:
The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:
- If the first line of a query contains the String Insert, then the second line contains two space separated integers x y,
and the value y must be inserted into L at index x.
- If the first line of a query contains the String Delete, then the second line contains index x,
whose element must be deleted from L.
Constraints:
Each element in is a 32-bit integer.
Output Format:
Print the updated list L as a single line of space-separated integers.*/