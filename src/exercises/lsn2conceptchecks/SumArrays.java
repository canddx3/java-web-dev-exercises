
package exercises.lsn2conceptchecks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main ( String[] args ) {
        ArrayList<Integer> numbs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int inputNumbs;

        do {
            System.out.println("Enter 10 numbers: ");
            inputNumbs = input.nextInt();
            numbs.add(inputNumbs);
            input.nextLine();

        } while (numbs.size() < 10);
        System.out.println(sumNumbers(numbs));
    }

    public static String sumNumbers ( ArrayList<Integer> arr ) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
                System.out.println(sumEven);
            } else {
                sumOdd += num;
                System.out.println(sumOdd);
            }
        }
        return "Even: " + sumEven + "\n" + "Odd: " + sumOdd;
    }
}

