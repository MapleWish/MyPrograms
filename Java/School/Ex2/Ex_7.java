/**
 * Ex_7
 */
import java.util.Scanner;
public class Ex_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int number_of_minutes = input.nextInt();
        int years = number_of_minutes / 365 / 60 / 24;
        int days = (number_of_minutes -years*365*60*24)/60/24;
        System.out.print(number_of_minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
}