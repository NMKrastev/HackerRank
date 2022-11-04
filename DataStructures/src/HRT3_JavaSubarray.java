import java.util.Scanner;

public class HRT3_JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numsArray = new int[n];
        int negativeSubArraysCount = 0;

        for (int i = 0; i < n; i++) {
            numsArray[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += numsArray[k];
                }

                if (sum < 0) {
                    negativeSubArraysCount++;
                }
            }
        }
        System.out.println(negativeSubArraysCount);
    }
}
/*We define the following:

A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
For example, if array = [1,2,3] then the subArrays are [1], [2], [3], [1,2], [2,3], and [1,2,3]. Something like [1,3]
would not be a subarray as it's not a
contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
- An array's sum is negative if the total sum of its elements is negative.
- An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative subArrays on a new line.
Input Format:
The first line contains a single integer, bn, denoting the length of array A = [a1,a2,...,an-1].
The second line contains n space-separated integers describing each respective element, ai, in array A.
Output Format:
Print the number of subArrays of A having negative sums.*/