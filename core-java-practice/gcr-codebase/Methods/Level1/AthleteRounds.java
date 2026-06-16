import java.util.Scanner;

public class AthleteRounds {

    public static double calculateRounds(
            double side1,
            double side2,
            double side3) {

        double perimeter =
                side1 + side2 + side3;

        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        System.out.println(
                calculateRounds(
                        s1,s2,s3));

        sc.close();
    }
}