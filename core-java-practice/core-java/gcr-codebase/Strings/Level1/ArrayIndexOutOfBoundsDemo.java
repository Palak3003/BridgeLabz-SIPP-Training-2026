import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void handleException(String[] names) {

        try {

            System.out.println(
                    names[names.length]
            );

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "ArrayIndexOutOfBoundsException Handled"
            );

        } catch(RuntimeException e) {

            System.out.println(
                    "Runtime Exception Handled"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for(int i=0;i<3;i++) {
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}