/**
 * Ex3_18
 */
import java.util.*;
public class Ex3_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input the weight of the packages:");
        int x = input.nextInt();
        cost(x);
    }

    public static void cost(int x) {
        if (x<= 1&&x>0) {
            System.out.print(3.5);
        }
        if (x <= 3 && x > 1) {
            System.out.print(3.5);
        }
        if (x <= 3 && x > 3) {
            System.out.print(3.5);
        }
        if (x <= 20 && x > 10) {
            System.out.print(3.5);
        }
        if (x>20) {
            System.out.print("the package cannot be shiipped");
        }
    }
}