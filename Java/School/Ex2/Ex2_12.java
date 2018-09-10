/**
 * Ex_12
 */
import java.util.Scanner;
public class Ex2_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration :");
        int speed = input.nextInt();
        double acceleration = input.nextDouble();
        double min_length = speed * speed / (2 * acceleration);
        System.out.printf("The minimum run way length for this airplane is %.3f",min_length);
    }
}