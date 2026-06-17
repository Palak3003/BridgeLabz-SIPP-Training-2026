import java.util.Scanner;

public class PalindromeRecursion {

    public static boolean palindrome(
            String text,
            int start,
            int end) {

        if(start >= end)
            return true;

        if(text.charAt(start)
                != text.charAt(end))
            return false;

        return palindrome(
                text,
                start + 1,
                end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        if(palindrome(
                text,
                0,
                text.length() - 1))

            System.out.println(
                    "Palindrome");

        else

            System.out.println(
                    "Not Palindrome");

        sc.close();
    }
}