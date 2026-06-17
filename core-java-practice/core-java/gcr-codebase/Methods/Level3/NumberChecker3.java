import java.util.Scanner;

public class NumberChecker3 {

    public static int[] reverse(
            int[] digits) {

        int[] reverse =
                new int[digits.length];

        int index = 0;

        for(int i =
            digits.length - 1;
            i >= 0;
            i--) {

            reverse[index++] =
                    digits[i];
        }

        return reverse;
    }

    public static boolean compare(
            int[] a,
            int[] b) {

        if(a.length != b.length)
            return false;

        for(int i = 0;
            i < a.length;
            i++) {

            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int number =
                sc.nextInt();

        String text =
                String.valueOf(number);

        int[] digits =
                new int[text.length()];

        for(int i = 0;
            i < text.length();
            i++) {

            digits[i] =
                    text.charAt(i)
                            - '0';
        }

        int[] reverse =
                reverse(digits);

        System.out.println(
                "Palindrome = "
                        + compare(
                        digits,
                        reverse));

        sc.close();
    }
}