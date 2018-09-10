/**
 * Ex2_3
 */
import java.util.Scanner;
public class Ex2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number inp pounds:");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.printf("%.1f pounds is %.3f kilograms", pounds, kilograms);
    }
}