/**
 * Ex2_1
 */

import java.util.Scanner;
public class Ex2_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        int Celsiu = input.nextInt();
        double Fahrenheit = Celsiu * (9.0 / 5) + 32;
        System.out.printf(Celsiu + " Celsius is " + " Fahrenheit %.1f",Fahrenheit);
        
    }
}