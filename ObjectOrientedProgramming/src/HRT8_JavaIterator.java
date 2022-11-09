import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HRT8_JavaIterator {
    static Iterator func(ArrayList myList) {
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next(); //~~~Complete this line~~~
            if (element instanceof String) {//if(~~~Complete this line~~~); Hints: use instanceof operator
                break;
            }
        }
        return it;

    }

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }

        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }

        Iterator it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
/*Java Iterator class can help you to iterate through every element in a collection. Here is a simple example:
import java.util.*;
public class Example{

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
In this problem you need to complete a method func. The method takes an ArrayList as input.
In that ArrayList there is one or more integer numbers, then there is a special string "###",
after that there are one or more other strings.
You have to modify the func method by editing at most 2 lines so that the code
only prints the elements after the special string "###". */