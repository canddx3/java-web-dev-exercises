package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class wordList {
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("searchword");
        int length = input.nextInt();
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("bye");
        words.add("help");
        words.add("see");
        printWords(words, length);
    }

    public static void printWords ( ArrayList<String> words, int length ) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
//    public static void main (String[] args ) {
//        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String arrayStr[] = str.split(" ");
//        List<String> myList = new ArrayList<String>();
//        myList = Arrays.asList(arrayStr);
//        for(String s: myList) {
//            if(s.length() > 3) {
//                System.out.println(s);
//            }
//        }


