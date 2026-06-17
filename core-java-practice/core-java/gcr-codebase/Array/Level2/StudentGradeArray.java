import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i=0;i<n;i++) {

            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int maths = sc.nextInt();

            percentage[i] = (phy + chem + maths) / 3.0;

            if(percentage[i] >= 90)
                grade[i] = 'A';
            else if(percentage[i] >= 75)
                grade[i] = 'B';
            else if(percentage[i] >= 50)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        for(int i=0;i<n;i++) {
            System.out.println(
                    "Percentage = "
                            + percentage[i]
                            + " Grade = "
                            + grade[i]);
        }

        sc.close();
    }
}