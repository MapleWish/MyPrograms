/**
 * Ex3_11
 */
import java.util.*;
public class Ex3_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year and month:");
        int year = input.nextInt();
        int month = input.nextInt();
        int days = days(isLeapYear(year), year, month);
        System.out.printf("%d %d has %d days",month,year,days);

    }
    
    public static int isLeapYear(int year) {
        int flag = 0;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            flag = 1;
        }
        return flag;
    }
    
    public static int days(int flag, int year,int month) {
        int month_day=30;
        if (flag == 1 && month == 2) {
            month_day = 28;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            month_day = 31;
        }
        return month_day;
    }
}