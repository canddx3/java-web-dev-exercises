package exercises.lsn1datatypes;
import java.util.Scanner;

public class numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("miles driven?");
        Integer miles = input.nextInt();
        System.out.println("gallons?");
        Integer gallons = input.nextInt();
        Integer MPG = miles/gallons;
        System.out.println("Mpg = " + MPG);

    }
}
