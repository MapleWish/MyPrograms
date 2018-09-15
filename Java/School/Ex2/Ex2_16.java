import java.util.Scanner;

/**
 * Ex_16
 */
public class Ex2_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side:");
        double side = input.nextDouble();
        double hexagon = 3 * Math.pow(3.0, 0.5) / 2 * side * side;
        System.out.printf("The area of the hexagon is %.4f",hexagon);
    }
}