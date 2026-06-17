public class FootballTeamHeight {

    public static int[] generateHeights() {

        int[] heights = new int[11];

        for(int i = 0; i < heights.length; i++) {

            heights[i] =
                    (int)(Math.random() * 101)
                            + 150;
        }

        return heights;
    }

    public static int sum(int[] heights) {

        int sum = 0;

        for(int h : heights)
            sum += h;

        return sum;
    }

    public static double mean(int[] heights) {

        return (double)sum(heights)
                / heights.length;
    }

    public static int shortest(
            int[] heights) {

        int min = heights[0];

        for(int h : heights)
            min = Math.min(min,h);

        return min;
    }

    public static int tallest(
            int[] heights) {

        int max = heights[0];

        for(int h : heights)
            max = Math.max(max,h);

        return max;
    }

    public static void main(String[] args) {

        int[] heights =
                generateHeights();

        System.out.println(
                "Heights:");

        for(int h : heights)
            System.out.print(
                    h + " ");

        System.out.println(
                "\nMean = "
                        + mean(heights));

        System.out.println(
                "Shortest = "
                        + shortest(heights));

        System.out.println(
                "Tallest = "
                        + tallest(heights));
    }
}