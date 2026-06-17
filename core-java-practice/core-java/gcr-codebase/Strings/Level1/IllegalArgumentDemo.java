import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void handleException(String text) {

        try {

            System.out.println(
                    text.substring(5,2)
            );

        } catch(IllegalArgumentException e) {

            System.out.println(
                    "IllegalArgumentException Handled"
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