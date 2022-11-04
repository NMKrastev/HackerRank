import java.util.Scanner;

public class HRT2_Java2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numsArray = new int[10][10];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                numsArray[i][j] = scanner.nextInt();

            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i <= 3 && j <= 3) {
                    int sum = numsArray[i][j] + numsArray[i][j + 1] + numsArray[i][j + 2] +
                            (numsArray[i + 1][j + 1]) + numsArray[i + 2][j] + numsArray[i + 2][j + 1] + numsArray[i + 2][j + 2];
                    if (sum > maxSum) maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
/*You are given a  2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.
Input Format:
There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.
Output Format:
Print the answer to this problem on a single line.*/