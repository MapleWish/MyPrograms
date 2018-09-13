/**
 * Ex3_22
 */
import java.util.*;
public class Ex3_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("the point's position:");
        int x = input.nextInt();
        int y = input.nextInt();
        IsInCircle(x, y);
    }

    public static void IsInCircle(int x,int y ) {
        double distance = Math.pow(x * x + y * y, 0.5);
        if (distance <= 10) {
            System.out.print("It is in circle");
        } else {
            System.out.print("It is not in circle");
        }
    }
}