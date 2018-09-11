/**
 * Ex3_1
 */

import java.util.Scanner;
public class Ex3_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1 = (-b + Math.pow(b *b - 4 * a * c, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(b *b - 4 * a * c, 0.5)) / (2 * a);

        double test = b * 2 - 4 * a*c;
        if (test >= 0) {
            if (test==0) {
                System.out.print("The equation has one root " + r1);
            }
            else {
                System.out.printf("The equation has two roots %f and %f",r1,r2);
            }
        }
        else {
            System.out.print("The equation has no real roots");
        }
    }
}