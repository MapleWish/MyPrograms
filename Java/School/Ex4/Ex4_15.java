
/**
 * Ex4_15
 * How to input a char:
 * String temp = input.next();
 *       char a = temp.charAt(0);
 * 
 */
import java.util.*;

public class Ex4_15 {

    public static void main(String[] args) {
        showx();

    }
    public static void showx() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade:");
        String temp = input.next();
        String temp2 = temp.toUpperCase();
        char a = temp2.charAt(0);
        

        if (a<='Z'&&a>='A') {
            int [] x= new int[] {2,3,4,5,6,7,8,9};
            if (a <= 'C')
                System.out.print("The corresponding number is 2");
            else if (a <= 'F')
                System.out.print("The corresponding number is 2");
            else if (a <= 'I')
                System.out.print("The corresponding number is 2");
            else if (a <= 'L')
                System.out.print("The corresponding number is 2");
            else if (a <= 'O')
                System.out.print("The corresponding number is 2");
            else if (a <= 'S')
                System.out.print("The corresponding number is 2");
            else if (a <= 'V')
                System.out.print("The corresponding number is 2");
            else if (a <= 'Z')
                System.out.print("The corresponding number is 2");
            
        }
        else System.out.printf("%s is an invalid input", temp);
    }
}