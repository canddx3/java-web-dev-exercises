package exercises;
import java.util.Scanner;

public class area {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("length is?");
        Double height = input.nextDouble();
        System.out.println("width?");
        Double width = input.nextDouble();
        Double rectangle = width * height;
        System.out.println("rectangle area is " + rectangle);
    }
}
