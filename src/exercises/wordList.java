package exercises;
import java.util.*;

public class wordList {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("searchword");
        String word = input.nextLine();
        if(word.length() == 5) {
            System.out.println(word);
        }
//    public static void main (String[] args ) {
//        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String arrayStr[] = str.split(" ");
//        List<String> myList = new ArrayList<String>();
//        myList = Arrays.asList(arrayStr);
//        for(String s: myList) {
//            if(s.length() == 5) {
//                System.out.println(s);
//            }
//        }
    }
}

