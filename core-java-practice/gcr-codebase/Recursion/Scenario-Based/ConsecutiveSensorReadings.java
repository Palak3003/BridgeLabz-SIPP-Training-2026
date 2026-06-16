import java.util.Scanner;

public class ConsecutiveSensorReadings {

    public static boolean isIncreasing(
            int[] readings,
            int index) {

        if(index == readings.length - 1)
            return true;

        if(readings[index]
                >= readings[index + 1])
            return false;

        return isIncreasing(
                readings,
                index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of readings: ");

        int n = sc.nextInt();

        int[] readings = new int[n];

        System.out.println(
                "Enter readings:");

        for(int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }

        System.out.println(
                isIncreasing(readings,0));

        sc.close();
    }
}