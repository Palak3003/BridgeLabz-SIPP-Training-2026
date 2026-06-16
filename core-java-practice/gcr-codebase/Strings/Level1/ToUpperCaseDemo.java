import java.util.Scanner;

public class ToUpperCaseDemo {

    public static String convertUpper(String text) {

        String result = "";

        for(int i=0;i<text.length();i++) {

            char ch = text.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compare(String s1,String s2) {

        if(s1.length()!=s2.length())
            return false;

        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String user = convertUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println(user);
        System.out.println(builtIn);

        System.out.println(compare(user,builtIn));

        sc.close();
    }
}