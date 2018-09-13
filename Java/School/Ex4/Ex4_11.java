/**
 * Ex4_11
 */
import java.util.*;

public class Ex4_11 {

    public static void main(String[] args) {
        showx();

    }
    public static void showx() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15):");
        int a = input.nextInt();
        if (a < 15) {
            if (a < 10) {
                System.out.printf("The binary value is %d", a);
            } else {
                char[] x = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
                System.out.printf("The binary value is %c", x[a - 10]);
            }
        }
        System.out.printf("%d is an invalid input", a);
    }
}