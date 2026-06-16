import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitText(String text) {

        String[] words = text.split(" ");
        return words;
    }

    public static String[] findShortestLongest(String[] words) {

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[] result = findShortestLongest(words);

        System.out.println("Shortest Word = " + result[0]);
        System.out.println("Longest Word = " + result[1]);

        sc.close();
    }
}