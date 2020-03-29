package test;

import solutions.Solution13;

public class TestSolution13 {
    public static void test(){
        Solution13 s = new Solution13();
        System.out.println(s.romanToInt("III"));

        Solution13 s1 = new Solution13();
        System.out.println(s1.romanToInt("IV"));

        Solution13 s2 = new Solution13();
        System.out.println(s2.romanToInt("IX"));

        Solution13 s3 = new Solution13();
        System.out.println(s3.romanToInt("LVIII"));

        Solution13 s4 = new Solution13();
        System.out.println(s4.romanToInt("MCMXCIV"));
    }
}
