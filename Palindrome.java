
import java.util.Scanner;

public class Palindrome {

    public static void checkpalindrome(String str) {
        int length = str.length();
        boolean isPalindrome = true;

        // Compare characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String str = sn.next();
        System.out.println(str);

        if (str.length() == 1) {
            System.out.println("enter the larger string ");

        } else {
            checkpalindrome(str);
        }

    }
}
