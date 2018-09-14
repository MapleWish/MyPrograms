
/**
 * Ex4_14
 * How to input a char:
 * String temp = input.next();
 *       char a = temp.charAt(0);
 * 
 */
import java.util.*;

public class Ex4_14 {

    public static void main(String[] args) {
        showx();

    }
    public static void showx() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade:");
        String temp = input.next();
        char a = temp.charAt(0);
        

        if (a < 'E') {
            int [] x= new int[] {4,3,2,1,0};
            System.out.printf("The numeric value for grade %s is %d",a, x[a-'A']);
        }
        else System.out.printf("%s is an invalid input", a);
    }
}