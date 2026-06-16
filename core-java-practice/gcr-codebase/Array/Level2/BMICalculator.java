import java.util.Scanner;

public class BMICalculator {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int persons = input.nextInt();

        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = getStatus(bmi[i]);
        }

        for (int i = 0; i < persons; i++) {
            System.out.println(height[i] + " " + weight[i] +
                    " BMI=" + bmi[i] +
                    " Status=" + status[i]);
        }

        input.close();
    }
}