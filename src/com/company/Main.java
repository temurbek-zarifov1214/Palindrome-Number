package com.company;

/**
 * @author temur
 * @version 0.1
 * @apiNote This is Palindrome-Number problem from leetcode,
 * which is going to be solved in right way and effective way
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(9987654321L));
//        isPalindrome(-121);
    }
    public static boolean isPalindrome(long a) {
        if (a >=0) {
            long num;
            String number = "";
            String s = Long.toString(a);
            for (int i = s.length() - 1; i >= 0; i--) {
                number = number + s.charAt(i);
            }
            num = Long.parseLong(number);
            return num == a;
        }
        return false;
    }
//    public static boolean isPalindrome(int a) {
//        if (a >= 0) {
//            int num;
//            String number = "";
//            String s = Integer.toString(a);
//            for (int i = s.length() - 1; i >= 0; i--) {
//                number = number + s.charAt(i);
//            }
//            num = Integer.parseInt(number);
//            return num == a;
//        }
//        return false;
//    }
}
