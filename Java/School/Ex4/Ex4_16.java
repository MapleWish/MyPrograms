import java.util.*;

public class Ex4_16 {

    public static void main(String[] args) {
        int x = 0;
        while (1 == 1) {
            x = (int) (Math.random() * 100);
            if (x >= 65 && x <= 90)
                break;
        }
        char c = (char) x;

        System.out.print(c);
    }
}