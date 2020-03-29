package solutions;

import test.TestSolution13;

import java.lang.reflect.InvocationTargetException;

public class Solution13 implements SolutionNumber {
/*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
* */

    public int romanToInt(String s) {
        int l = s.length();
        int result = 0;

        for(int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (i == l - 1) {
                switch (c) {
                    case 'I':
                        result += 1;
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        result += 10;
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        result += 100;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }
            } else {
                switch (c) {
                    case 'I':
                        if (s.charAt(i + 1) != 'V' && s.charAt(i + 1) != 'X') {
                            result += 1;
                        } else if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                        }
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'X':
                        if (s.charAt(i + 1) != 'L' && s.charAt(i + 1) != 'C') {
                            result += 10;
                        } else if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                        }
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'C':
                        if (s.charAt(i + 1) != 'D' && s.charAt(i + 1) != 'M') {
                            result += 100;
                        } else if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                        }
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'M':
                        result += 1000;
                        break;
                }

            }
        }
        return result;
    }

    public static void printSolution() throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        System.out.println("This is the solution of number 13.");
        Class c = Class.forName("test.TestSolution13");
        c.getMethod("test", null).invoke(new Object());

        //System.out.println(TestSolution13.class.getMethod("main",null).invoke());
        //Todo
        //create a file of romantoInetger class
        //System.out.println(Solution13.class.getMethod("romanToInt", String.class).getDeclaringClass().toString());


    }
}
