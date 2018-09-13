/**
 * Ex3_23
 */
import java.util.*;
public class Ex3_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("the point's position:");
        int x = input.nextInt();
        int y = input.nextInt();
        IsInRectangle(x, y);
    }

    public static void IsInRectangle(int x,int y ) {
        
        if (Math.abs(x)<5&&Math.abs(y)<2.5) {
            System.out.print("It is in Rectangle");
        } else {
            System.out.print("It is not in Rectangle");
        }
    }
}