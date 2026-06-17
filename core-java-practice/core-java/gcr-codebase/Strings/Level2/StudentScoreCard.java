import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(
            int students) {

        int[][] scores =
                new int[students][3];

        for(int i = 0; i < students; i++) {

            scores[i][0] =
                    (int)(Math.random()*100);

            scores[i][1] =
                    (int)(Math.random()*100);

            scores[i][2] =
                    (int)(Math.random()*100);
        }

        return scores;
    }

    public static double[][] calculateResult(
            int[][] scores) {

        double[][] result =
                new double[scores.length][3];

        for(int i = 0; i < scores.length; i++) {

            int total =
                    scores[i][0]
                            + scores[i][1]
                            + scores[i][2];

            double average =
                    total / 3.0;

            double percentage =
                    total / 3.0;

            average =
                    Math.round(
                            average * 100.0)
                            / 100.0;

            percentage =
                    Math.round(
                            percentage * 100.0)
                            / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String[] calculateGrade(
            double[][] result) {

        String[] grades =
                new String[result.length];

        for(int i = 0; i < result.length; i++) {

            double percentage =
                    result[i][2];

            if(percentage >= 90)
                grades[i] = "A+";
            else if(percentage >= 80)
                grades[i] = "A";
            else if(percentage >= 70)
                grades[i] = "B";
            else if(percentage >= 60)
                grades[i] = "C";
            else if(percentage >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        return grades;
    }

    public static void display(
            int[][] scores,
            double[][] result,
            String[] grades) {

        System.out.println(
                "Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for(int i = 0; i < scores.length; i++) {

            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Students: ");

        int students = sc.nextInt();

        int[][] scores =
                generateScores(students);

        double[][] result =
                calculateResult(scores);

        String[] grades =
                calculateGrade(result);

        display(scores,
                result,
                grades);

        sc.close();
    }
}