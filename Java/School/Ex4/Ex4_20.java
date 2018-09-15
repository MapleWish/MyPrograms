import java.util.*;

public class Ex4_20 {

    public static void main(String[] args) {
        showx();

    }

    public static void showx() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String temp = input.next();
        System.out.println(temp.length());
        
        System.out.println(temp.charAt(0));

    }
}