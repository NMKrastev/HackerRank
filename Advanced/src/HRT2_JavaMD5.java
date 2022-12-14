import java.math.BigInteger;
import java.security.*;
import java.util.Scanner;

public class HRT2_JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] theMD5digest = md.digest(line.getBytes());
        BigInteger number = new BigInteger(1, theMD5digest);
        String hashText = number.toString(16);

        System.out.println(hashText);

    }
}
/*MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value.
Here are some common uses for MD5:
- To store a one-way hash of a password.
- To provide some assurance that a transferred file has arrived intact.
MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, 1994);
however, the security of MD5 has been severely compromised, most infamously by the Flame malware in 2012.
The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".
Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
Input Format

A single alphanumeric string denoting s.*/