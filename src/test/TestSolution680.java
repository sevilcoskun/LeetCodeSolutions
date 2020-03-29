package test;

import solutions.Solution680;

public class TestSolution680 {
    public static void test(){
        Solution680 s = new Solution680();
        System.out.println(s.validPalindrome("aba"));

        Solution680 s1 = new Solution680();
        System.out.println(s1.validPalindrome("abca"));

        Solution680 s2 = new Solution680();
        System.out.println(s2.validPalindrome("abdca"));

        Solution680 s3 = new Solution680();
        System.out.println(s3.validPalindrome("abcdefghabcahgfedcba"));

    }
}
