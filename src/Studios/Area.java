package Studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("radius?");
        Integer radius = input.nextInt();
        double area = Circle.getArea(radius);
        System.out.println(area);
    }
}
