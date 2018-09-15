
/**
 * Ex4_8
 * 使用(type) x ;进行强制类型转换
 */
import java.util.*;

public class Ex4_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code:");
        int x = input.nextInt();
        System.out.printf("The character for ASCII code %d is %c",x,showchar(x));
    }

    public static char showchar(int r) {
        char x = (char) r;
        return x;
    }
}