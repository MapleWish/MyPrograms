import java.util.*;

public class Ex4_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1:");
        String s1 = input.next();
        System.out.print("Enter string s2:");
        String s2 = input.next();
        int result1 = s1.indexOf(s2);
        if(result1 != -1){
            System.out.println(s2+" is a substring of "+s1);
        }else{
            System.out.println(s2+" is not a substring of "+s1);
        }
    }
}

