package studios;
import java.util.Scanner;

public class Area {
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius?");
        double radius = input.nextInt();
        while (radius >= 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area is: " + area);
            radius = input.nextInt();
        }
        System.out.println("please enter positive number");
    }
}