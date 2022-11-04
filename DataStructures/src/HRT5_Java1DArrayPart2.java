import java.util.Scanner;

public class HRT5_Java1DArrayPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        while (q-- > 0) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scanner.close();
    }

    public static boolean canWin(int leap, int[] game, int index) {
        // Return true if you can win the game; otherwise, return false.
        if (index > game.length - 1) {
            return true;
        }
        if (index < 0 || game[index] == 1) {
            return false;
        }
        game[index] = 1;
        return canWin(leap, game, index + leap) || canWin(leap, game, index + 1)
                || canWin(leap, game, index - 1);
    }
}
/*Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0 <= i < n),
you can perform one of the following moves:
Move Backward: If cell i - 1 exists and contains a 0, you can walk back to cell i - 1.
Move Forward:
- If cell i + 1 contains a zero, you can walk to cell i + 1.
- If cell i + leap contains a zero, you can jump to cell i + leap.
- If you're standing in cell n - 1 or the value of , i + leap >= n you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i + 1, i - 1, or i + leap as long as the destination index is a cell containing a 0.
If the destination index is greater than n - 1, you win the game.
Function Description
Complete the canWin function in the editor below.
canWin has the following parameters:
int leap: the size of the leap
int game[n]: the array to traverse
Returns
boolean: true if the game can be won, otherwise false
Input Format
The first line contains an integer, q, denoting the number of queries (i.e., function calls).
The 2q subsequent lines describe each query over two lines:
- The first line contains two space-separated integers describing the respective values of n and leap.
- The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective
values of game0, game1,....,game n-1.
It is guaranteed that the value of game[0] is always 0.*/