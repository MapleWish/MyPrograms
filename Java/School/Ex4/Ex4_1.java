/**
 * Ex4_1
 */
import java.util.*;

public class Ex4_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thelength from the center to vertex:");
        double r = input.nextDouble();
        System.out.printf("The area of the pentagon is %.2f",area(r));
    }

    public static double area(double r) {
        double s = 0;
        double x = 0;
        s = 2 * r * Math.sin(Math.PI / 5);
        x = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        return x;
    }
}