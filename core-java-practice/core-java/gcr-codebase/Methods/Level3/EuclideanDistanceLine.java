import java.util.Scanner;

public class EuclideanDistanceLine {

    public static double distance(
            double x1,
            double y1,
            double x2,
            double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2)
                        +
                        Math.pow(y2 - y1, 2));
    }

    public static double equationLength(
            double a,
            double b,
            double c) {

        return Math.abs(c)
                / Math.sqrt(
                a*a + b*b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println(
                "Distance = "
                        + distance(
                        x1,y1,x2,y2));

        sc.close();
    }
}