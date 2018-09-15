/**
 * Ex_21
 */
import java.util.Scanner;

public class Ex2_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double investment_amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double annual_interest_rate = input.nextDouble();
        System.out.print("Enter number of years:");
        int number_of_years = input.nextInt();
        double accumulated_value = investment_amount * Math.pow(1 + annual_interest_rate/100/12, number_of_years * 12); 
        System.out.printf("Accumulated value is $%.2f",accumulated_value);
    }
    
}