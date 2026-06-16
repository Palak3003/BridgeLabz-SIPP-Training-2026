import java.util.Scanner;

public class EmployeeBonusZara {

    public static double calculateBonus(
            double salary,
            double years) {

        if(years > 5)
            return salary * 0.05;
        else
            return salary * 0.02;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        for(int i = 0; i < 10; i++) {

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years: ");
            years[i] = sc.nextDouble();
        }

        for(int i = 0; i < 10; i++) {

            bonus[i] =
                    calculateBonus(
                            salary[i],
                            years[i]);

            newSalary[i] =
                    salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println(
                "\nSalary\tBonus\tNew Salary");

        for(int i = 0; i < 10; i++) {

            System.out.printf(
                    "%.2f\t%.2f\t%.2f\n",
                    salary[i],
                    bonus[i],
                    newSalary[i]);
        }

        System.out.println(
                "\nTotal Bonus = "
                        + totalBonus);

        System.out.println(
                "Total Old Salary = "
                        + totalOldSalary);

        System.out.println(
                "Total New Salary = "
                        + totalNewSalary);

        sc.close();
    }
}