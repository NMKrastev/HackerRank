import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Permission;

public class HRT5_CanYouAccess {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            //Write your code here
            o = new Inner().new Private();
            System.out.println(String.format("%s is %s", num, new Inner().new Private().powerof2(num)));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
            //To here

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }//end of Inner

}//end of HRT5_CanYouAccess

class DoNotTerminate { //This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {

        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
/*You are given a class Solution and an inner class Inner.Private. The main method of class Solution
takes an integer num as input. The powerof2 in class Inner.Private checks whether a number is a power of 2.
You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.*/