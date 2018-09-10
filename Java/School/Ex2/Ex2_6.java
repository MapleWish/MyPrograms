/**
 * Ex2_6
 */
import java.util.Scanner;
public class Ex2_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int n = input.nextInt();
        int n0 = n / 1000;
        int n1 = n / 100%10;
        int n2 = n / 10%10;
        int n3 = n % 10;
        
        int sum = n0 + n1 + n2 + n3;
        System.out.printf("The sum of the digits is %d",sum);
    }
}