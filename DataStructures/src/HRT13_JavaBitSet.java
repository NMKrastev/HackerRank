import java.util.BitSet;
import java.util.Scanner;

public class HRT13_JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int numOfOperations = scanner.nextInt();

        BitSet bitSet1 = new BitSet(length);
        BitSet bitSet2 = new BitSet(length);
        BitSet[] bitSets = {bitSet1, bitSet2};

        String operation = "";
        int firstArg = 0;
        int secondArg = 0;

        for (int i = 0; i < numOfOperations; i++) {

            operation = scanner.next();
            firstArg = scanner.nextInt();
            secondArg = scanner.nextInt();

            // for each operation define case
            switch (operation) {
                case "AND":
                    bitSets[firstArg - 1].and(bitSets[secondArg - 1]);
                    break;
                case "OR":
                    bitSets[firstArg - 1].or(bitSets[secondArg - 1]);
                    break;
                case "XOR":
                    bitSets[firstArg - 1].xor(bitSets[secondArg - 1]);
                    break;
                case "FLIP":
                    bitSets[firstArg - 1].flip(secondArg);
                    break;
                case "SET":
                    bitSets[firstArg - 1].set(secondArg);
                    break;
            }

            System.out.printf("%d %d%n", bitSet1.cardinality(), bitSet2.cardinality());
        }
    }
}
/*Java's BitSet class implements a vector of bit values (i.e.:  false(0) or  true(1)) that grows as needed, allowing us to easily
manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.
Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
Input Format:
The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2)
and M (the number of operations to perform), respectively.
The M subsequent lines each contain an operation in one of the following forms:
AND <set><set>
OR <set><set>
XOR <set><set>
FLIP <set><index>
SET <set><index>
In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
<index< is an integer denoting a bit's index in the BitSet corresponding to <set>.
For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the operation
replaces the contents of the first operand. For example:
AND 2 1
B2 is the left operand, and B1 is the right operand. This operation should assign the result of B2^B1 to B2.
Output Format:
After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line.*/