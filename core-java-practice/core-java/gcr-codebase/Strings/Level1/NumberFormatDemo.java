import java.util.Scanner;

public class NumberFormatDemo {

    public static void handleException(String text) {

        try {

            int number = Integer.parseInt(text);

            System.out.println(number);

        } catch(NumberFormatException e) {

            System.out.println(
                    "NumberFormatException Handled"
            );

        } catch(RuntimeException e) {

            System.out.println(
                    "Runtime Exception Handled"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        handleException(text);

        sc.close();
    }
}