package exercises.lsn2conceptchecks;
import java.util.ArrayList;
import java.util.Arrays;

public class singleArray {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
        System.out.println("\n");
        for (Integer numb: intArray) {
            if(numb % 2 != 0) {
                System.out.print(numb);
            }
        }
        System.out.println("\n");
        String str = "I would not, could not, in a box. I " +
                "would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat " +
                "them with a mouse.";

        String[] newStr = str.split("");
        System.out.println(Arrays.toString(newStr));
        System.out.println("\n");
        String[] newsStr = str.split("\\.");
        System.out.println(Arrays.toString(newsStr));
    }
}
