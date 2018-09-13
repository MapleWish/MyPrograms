/**
 * Ex3_8
 */
import java.util.*;
public class Ex3_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int[] x = new int[] { a, b, c };
        arrange(x);
        
    }
    
    public static void arrange(int []x) {
        Arrays.sort(x);
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i]+" ");
        }
    }
}