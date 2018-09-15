import java.util.*;

public class Ex4_21 {

    public static void main(String[] args) {
        showx();

    }

    public static void showx() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN:");
        String temp = input.next();
        if(temp.length()==11&&temp.charAt(3)=='-'&&temp.charAt(6)=='-')
            System.out.println(temp + " is a valid social security number");
            
        else System.out.println(temp + " is a invalid social security number");

    }
}