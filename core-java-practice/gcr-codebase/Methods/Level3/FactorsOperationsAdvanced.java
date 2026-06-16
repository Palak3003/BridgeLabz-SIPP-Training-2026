import java.util.Scanner;

public class FactorsOperationsAdvanced {

    public static int[] factors(
            int number) {

        int count = 0;

        for(int i = 1;
            i <= number;
            i++) {

            if(number % i == 0)
                count++;
        }

        int[] factors =
                new int[count];

        int index = 0;

        for(int i = 1;
            i <= number;
            i++) {

            if(number % i == 0)

                factors[index++] = i;
        }

        return factors;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int number =
                sc.nextInt();

        int[] factors =
                factors(number);

        int greatest = factors[0];
        int sum = 0;
        long product = 1;
        double cubeProduct = 1;

        for(int factor : factors) {

            greatest =
                    Math.max(
                            greatest,
                            factor);

            sum += factor;

            product *= factor;

            cubeProduct *=
                    Math.pow(
                            factor,
                            3);
        }

        System.out.println(
                "Greatest Factor = "
                        + greatest);

        System.out.println(
                "Sum = "
                        + sum);

        System.out.println(
                "Product = "
                        + product);

        System.out.println(
                "Cube Product = "
                        + cubeProduct);

        sc.close();
    }
}