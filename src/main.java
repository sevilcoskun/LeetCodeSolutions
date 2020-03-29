import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class main {
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Hello! This is my Leet Code Solution application.\nPlease enter the number of problem to see my solution:");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //call the class that include code
        String sn = "Solution" + number;

        Class c = Class.forName("solutions."+sn);
        c.getMethod("printSolution", null).invoke(new Object());

    }
}
