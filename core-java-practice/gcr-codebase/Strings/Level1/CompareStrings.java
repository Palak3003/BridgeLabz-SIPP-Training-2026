import java.util.Scanner;

public class CompareStrings {

    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.next();

        System.out.print("Enter String 2: ");
        String s2 = sc.next();

        System.out.println("charAt compare: " + compareUsingCharAt(s1, s2));
        System.out.println("equals(): " + s1.equals(s2));
    }
}