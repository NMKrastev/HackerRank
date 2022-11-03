import java.util.Scanner;
import java.util.*;

public class HRT5_JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character, Integer> anagramAMap = new TreeMap<>();
        Map<Character, Integer> anagramBMap = new TreeMap<>();
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            anagramAMap.putIfAbsent(a.charAt(i), 1);
            anagramAMap.put(a.charAt(i), anagramAMap.get(a.charAt(i)) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            anagramBMap.putIfAbsent(b.charAt(i), 1);
            anagramBMap.put(b.charAt(i), anagramBMap.get(b.charAt(i)) + 1);
        }

        if (anagramAMap.equals(anagramBMap)) {
            return true;
        }
        return false;
    }
}
/*wo strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
Function Description
Complete the isAnagram function in the editor.
isAnagram has the following parameters:
- string a: the first string
- string b: the second string
Returns
- boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format
The first line contains a string a.
The second line contains a string b.*/