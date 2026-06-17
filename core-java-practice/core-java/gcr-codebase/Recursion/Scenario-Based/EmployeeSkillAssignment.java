import java.util.Scanner;

public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int target,
            int index,
            String currentTeam,
            int currentSum) {

        if(currentSum == target) {

            System.out.println(
                    "[" + currentTeam + "]");
            return;
        }

        if(index == skills.length
                || currentSum > target)
            return;

        String newTeam;

        if(currentTeam.equals(""))
            newTeam =
                    String.valueOf(
                            skills[index]);
        else
            newTeam =
                    currentTeam
                            + ","
                            + skills[index];

        findTeams(
                skills,
                target,
                index + 1,
                newTeam,
                currentSum
                        + skills[index]);

        findTeams(
                skills,
                target,
                index + 1,
                currentTeam,
                currentSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of employees: ");

        int n = sc.nextInt();

        int[] skills =
                new int[n];

        System.out.println(
                "Enter skill scores:");

        for(int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        System.out.print(
                "Enter target score: ");

        int target =
                sc.nextInt();

        System.out.println(
                "Possible Teams:");

        findTeams(
                skills,
                target,
                0,
                "",
                0);

        sc.close();
    }
}