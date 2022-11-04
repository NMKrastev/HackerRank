import java.util.Scanner;

public class HRT8_JavaGenerics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numsArray = new Integer[3];
        numsArray[0] = 1;
        numsArray[1] = 2;
        numsArray[2] = 3;
        String[] wordsArray = {"Hello", "World"};
        PrintArray printArray = new PrintArray();
        printArray.printArray(numsArray);
        printArray.printArray(wordsArray);

    }
}

class PrintArray {
    public <Array> void printArray(Array[] arr){
        for (Array array : arr) {
            System.out.println(array);
        }
    }
}
/*Generic methods are a very efficient way to handle multiple datatypes using a single method.
This problem will test your knowledge on Java Generic methods.
Let's say you have an integer array and a string array. You have to write a single method printArray that
can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
You are given code in the editor. Complete the code so that it prints the following lines:*/