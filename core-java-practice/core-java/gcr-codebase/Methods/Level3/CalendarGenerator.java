import java.util.Scanner;

public class CalendarGenerator {

    static String[] months = {
            "January","February",
            "March","April",
            "May","June",
            "July","August",
            "September",
            "October",
            "November",
            "December"
    };

    static int[] days = {
            31,28,31,30,
            31,30,31,31,
            30,31,30,31
    };

    public static boolean isLeap(
            int year) {

        return (year % 400 == 0)
                ||
                (year % 4 == 0
                        && year % 100 != 0);
    }

    public static int getDays(
            int month,
            int year) {

        if(month == 2
                && isLeap(year))

            return 29;

        return days[month - 1];
    }

    public static int firstDay(
            int month,
            int year) {

        int d = 1;

        int y0 =
                year
                        - (14 - month)/12;

        int x =
                y0 + y0/4
                        - y0/100
                        + y0/400;

        int m0 =
                month
                        + 12*((14-month)/12)
                        - 2;

        return
                (d+x+
                        31*m0/12)%7;
    }

    public static void main(
            String[] args) {

        Scanner sc =
                new Scanner(System.in);

        int month =
                sc.nextInt();

        int year =
                sc.nextInt();

        System.out.println(
                months[month-1]
                        + " "
                        + year);

        System.out.println(
                "Sun Mon Tue Wed Thu Fri Sat");

        int first =
                firstDay(
                        month,
                        year);

        int totalDays =
                getDays(
                        month,
                        year);

        for(int i = 0;
            i < first;
            i++) {

            System.out.print(
                    "    ");
        }

        for(int day = 1;
            day <= totalDays;
            day++) {

            System.out.printf(
                    "%3d ",
                    day);

            if((day+first)%7==0)
                System.out.println();
        }
    }
}