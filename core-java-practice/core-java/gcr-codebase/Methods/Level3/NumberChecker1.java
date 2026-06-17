import java.util.Scanner;

public class NumberChecker1 {

    public static int countDigits(
            int number) {

        int count = 0;

        while(number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] digitsArray(
            int number) {

        int count =
                countDigits(number);

        int[] digits =
                new int[count];

        for(int i = count - 1;
            i >= 0;
            i--) {

            digits[i] =
                    number % 10;

            number /= 10;
        }

        return digits;
    }

    public static boolean isDuck(
            int[] digits) {

        for(int digit : digits) {

            if(digit == 0)
                return true;
        }

        return false;
    }

    public static boolean isArmstrong(
            int number,
            int[] digits) {

        int power =
                digits.length;

        int sum = 0;

        for(int digit : digits) {

            sum += Math.pow(
                    digit,
                    power);
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int number =
                sc.nextInt();

        int[] digits =
                digitsArray(number);

        int largest =
                Integer.MIN_VALUE;

        int secondLargest =
                Integer.MIN_VALUE;

        int smallest =
                Integer.MAX_VALUE;

        int secondSmallest =
                Integer.MAX_VALUE;

        for(int digit : digits) {

            if(digit > largest) {

                secondLargest =
                        largest;

                largest = digit;
            }
            else if(digit >
                    secondLargest) {

                secondLargest =
                        digit;
            }

            if(digit < smallest) {

                secondSmallest =
                        smallest;

                smallest = digit;
            }
            else if(digit <
                    secondSmallest) {

                secondSmallest =
                        digit;
            }
        }

        System.out.println(
                "Duck Number = "
                        + isDuck(digits));

        System.out.println(
                "Armstrong = "
                        + isArmstrong(
                        number,
                        digits));

        System.out.println(
                "Largest = "
                        + largest);

        System.out.println(
                "Second Largest = "
                        + secondLargest);

        System.out.println(
                "Smallest = "
                        + smallest);

        System.out.println(
                "Second Smallest = "
                        + secondSmallest);

        sc.close();
    }
}