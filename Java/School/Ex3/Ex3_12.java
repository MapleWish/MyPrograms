/**
 * Ex3_12
 */
import java.util.*;
public class Ex3_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a thress-digit integer:");
        int x = input.nextInt();
        ispal(x);
    }

    public static void ispal(int x) {
        if (x / 100 == x % 10) {
            System.out.printf("%d is a palindrome", x);
        }
        System.out.printf("%d is not a palindrome", x);
    }
}