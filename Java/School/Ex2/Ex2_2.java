/**
 * Ex2_2
 */

import java.util.Scanner;
public class Ex2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        int length = input.nextInt();
        double P = 3.14159;
        double area = radius * radius * P;
        double volume = area * length;
        /**
         * 只有printf才能格式化输出
         */
        System.out.printf("The area is %.4f",area);
        System.out.printf("\nThe volume is %.1f",volume);
        
    }
}