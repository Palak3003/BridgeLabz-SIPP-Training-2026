import java.util.Scanner;

public class PositiveNegativeEvenOdd {

    public static boolean isPositive(
            int number) {

        return number >= 0;
    }

    public static boolean isEven(
            int number) {

        return number % 2 == 0;
    }

    public static int compare(
            int n1,
            int n2) {

        if(n1 > n2)
            return 1;

        if(n1 < n2)
            return -1;

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers =
                new int[5];

        for(int i = 0;
            i < numbers.length;
            i++) {

            numbers[i] =
                    sc.nextInt();
        }

        for(int num : numbers) {

            if(isPositive(num)) {

                if(isEven(num))
                    System.out.println(
                            num
                                    + " Positive Even");
                else
                    System.out.println(
                            num
                                    + " Positive Odd");

            } else {

                System.out.println(
                        num
                                + " Negative");
            }
        }

        int result =
                compare(
                        numbers[0],
                        numbers[4]);

        if(result == 1)
            System.out.println(
                    "First Greater");

        else if(result == -1)
            System.out.println(
                    "First Less");

        else
            System.out.println(
                    "Equal");

        sc.close();
    }
}