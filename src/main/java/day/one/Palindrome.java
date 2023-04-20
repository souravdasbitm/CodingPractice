package day.one;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i) +"---"+str.charAt(str.length()-(i+1)));
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        String str1 = "abbas";
        if (isPalindrome(str1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
