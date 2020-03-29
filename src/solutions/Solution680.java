package solutions;

import java.lang.reflect.InvocationTargetException;

public class Solution680 implements SolutionNumber{
        public boolean validPalindrome(String s) {

            int l = s.length();
            String left = "", right = "";
            //boolean result = true;

            //check left and right equals with each other
            for(int i = 0; i < l/2; i++){
                if(s.charAt(i) != s.charAt(l-1-i)){
                    left = s.substring(i,l-1-i);
                    right = s.substring(i+1,l-i);
                    if(isPalindrome(left) || isPalindrome(right))
                        return true;
                    else{
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean isPalindrome(String str){
            //boolean b = true;
            for(int i = 0; i < str.length() / 2; i++){
                if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                    return false;
                }
            }
            return true;
        }

    public static void printSolution() throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        System.out.println("This is the solution of number3 680.");
        Class c = Class.forName("test.TestSolution680");
        c.getMethod("test", null).invoke(new Object());

        //Todo

    }
}
