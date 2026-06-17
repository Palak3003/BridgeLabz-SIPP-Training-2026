import java.util.Scanner;

public class StudentScoreCardAdvanced {

    public static String grade(
            double percentage) {

        if(percentage >= 90)
            return "A+";
        else if(percentage >= 80)
            return "A";
        else if(percentage >= 70)
            return "B";
        else if(percentage >= 60)
            return "C";
        else if(percentage >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Students: ");

        int n = sc.nextInt();

        int[][] marks =
                new int[n][3];

        double[] percentage =
                new double[n];

        String[] grades =
                new String[n];

        for(int i = 0; i < n; i++) {

            System.out.print(
                    "Physics: ");
            marks[i][0] =
                    sc.nextInt();

            System.out.print(
                    "Chemistry: ");
            marks[i][1] =
                    sc.nextInt();

            System.out.print(
                    "Maths: ");
            marks[i][2] =
                    sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            int total =
                    marks[i][0]
                            + marks[i][1]
                            + marks[i][2];

            percentage[i] =
                    total / 3.0;

            grades[i] =
                    grade(
                            percentage[i]);
        }

        System.out.println(
                "\nPhy\tChem\tMath\t%\tGrade");

        for(int i = 0; i < n; i++) {

            System.out.println(
                    marks[i][0]
                            + "\t"
                            + marks[i][1]
                            + "\t"
                            + marks[i][2]
                            + "\t"
                            + percentage[i]
                            + "\t"
                            + grades[i]);
        }

        sc.close();
    }
}