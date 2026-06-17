import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;

        System.out.println("Area in square centimeters is " + areaCm);
        System.out.println("Area in square inches is " + areaInch);
    }
}