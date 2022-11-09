import java.util.*;

public class HRT15_JavaDequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int num = scanner.nextInt();
            deque.add(num);
            set.add(num);

            if (i >= m - 1) {
                max = Math.max(max, set.size());
                int dequeueNum = deque.poll();
                if (!deque.contains(dequeueNum)) {
                    set.remove(dequeueNum);
                }
            }
        }

        System.out.println(max);
    }
}
/*In this problem, you are given N integers. You need to find the maximum number of unique integers among
all the possible contiguous subArrays of size M.
Note: Time limit is 3 second for this problem.
Input Format
The first line of input contains two integers N and N: representing the total number of integers and the size of the
subarray, respectively. The next line contains N space separated integers.
Constraints:
The numbers in the array will range between [0, 10000000].
Output Format:
Print the maximum number of unique integers among all possible contiguous subarrays of size M.*/