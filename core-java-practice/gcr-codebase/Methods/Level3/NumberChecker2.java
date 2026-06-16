import java.util.Scanner;

public class NumberChecker2 {

    public static int[] digitsArray(
            int number) {

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

        return digits;
    }

    public static int sumDigits(
            int[] digits) {

        int sum = 0;

        for(int digit : digits)
            sum += digit;

        return sum;
    }

    public static double sumSquares(
            int[] digits) {

        double sum = 0;

        for(int digit : digits)
            sum += Math.pow(
                    digit,
                    2);

        return sum;
    }

    public static boolean isHarshad(
            int number,
            int[] digits) {

        return number %
                sumDigits(digits)
                == 0;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int number =
                sc.nextInt();

        int[] digits =
                digitsArray(number);

        int[][] freq =
                new int[10][2];

        for(int i = 0;
            i < 10;
            i++) {

            freq[i][0] = i;
        }

        for(int digit : digits) {

            freq[digit][1]++;
        }

        System.out.println(
                "Sum = "
                        + sumDigits(digits));

        System.out.println(
                "Squares Sum = "
                        + sumSquares(digits));

        System.out.println(
                "Harshad = "
                        + isHarshad(
                        number,
                        digits));

        for(int i = 0;
            i < 10;
            i++) {

            if(freq[i][1] > 0)

                System.out.println(
                        i + " -> "
                                + freq[i][1]);
        }

        sc.close();
    }
}