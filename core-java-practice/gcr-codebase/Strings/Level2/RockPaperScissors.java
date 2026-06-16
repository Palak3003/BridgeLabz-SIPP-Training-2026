import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if(choice == 0)
            return "Rock";

        if(choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String findWinner(
            String player,
            String computer) {

        if(player.equals(computer))
            return "Draw";

        if(player.equals("Rock")
                && computer.equals("Scissors"))
            return "Player";

        if(player.equals("Paper")
                && computer.equals("Rock"))
            return "Player";

        if(player.equals("Scissors")
                && computer.equals("Paper"))
            return "Player";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Games: ");
        int games = sc.nextInt();

        String[][] results =
                new String[games][4];

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for(int i = 0; i < games; i++) {

            System.out.println(
                    "\n1-Rock 2-Paper 3-Scissors");

            int choice = sc.nextInt();

            String player = "";

            switch(choice) {
                case 1:
                    player = "Rock";
                    break;
                case 2:
                    player = "Paper";
                    break;
                case 3:
                    player = "Scissors";
                    break;
            }

            String computer =
                    getComputerChoice();

            String winner =
                    findWinner(player,
                            computer);

            if(winner.equals("Player"))
                playerWins++;
            else if(winner.equals("Computer"))
                computerWins++;
            else
                draws++;

            results[i][0] =
                    String.valueOf(i + 1);
            results[i][1] = player;
            results[i][2] = computer;
            results[i][3] = winner;
        }

        System.out.println(
                "\nGame\tPlayer\tComputer\tWinner");

        for(int i = 0; i < games; i++) {

            System.out.println(
                    results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            results[i][3]);
        }

        double playerPercent =
                (playerWins * 100.0) / games;

        double computerPercent =
                (computerWins * 100.0) / games;

        System.out.println("\nPlayer Wins = "
                + playerWins);

        System.out.println("Computer Wins = "
                + computerWins);

        System.out.println("Draws = "
                + draws);

        System.out.println("Player Win % = "
                + playerPercent);

        System.out.println("Computer Win % = "
                + computerPercent);

        sc.close();
    }
}