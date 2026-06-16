import java.util.Scanner;

public class YoungestTallestFriend {

    public static int findYoungest(
            int[] ages) {

        int youngest = 0;

        for(int i = 1;
            i < ages.length;
            i++) {

            if(ages[i]
                    < ages[youngest])

                youngest = i;
        }

        return youngest;
    }

    public static int findTallest(
            double[] heights) {

        int tallest = 0;

        for(int i = 1;
            i < heights.length;
            i++) {

            if(heights[i]
                    > heights[tallest])

                tallest = i;
        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {
                "Amar",
                "Akbar",
                "Anthony"
        };

        int[] ages = new int[3];
        double[] heights =
                new double[3];

        for(int i = 0; i < 3; i++) {

            System.out.print(
                    names[i]
                            + " Age: ");

            ages[i] = sc.nextInt();

            System.out.print(
                    names[i]
                            + " Height: ");

            heights[i] =
                    sc.nextDouble();
        }

        int youngest =
                findYoungest(ages);

        int tallest =
                findTallest(heights);

        System.out.println(
                "Youngest = "
                        + names[youngest]);

        System.out.println(
                "Tallest = "
                        + names[tallest]);

        sc.close();
    }
}