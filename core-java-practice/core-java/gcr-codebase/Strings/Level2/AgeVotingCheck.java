import java.util.Random;

public class AgeVotingCheck {

    public static int[] generate(int n) {
        Random r = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(50) + 10;
        }
        return arr;
    }

    public static String[][] check(int[] ages) {
        String[][] res = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = generate(10);
        String[][] res = check(ages);

        for (String[] row : res) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}