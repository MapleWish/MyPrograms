/**
 * Ex3_5
 */

import java.util.Scanner;

public class Ex3_5 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day:");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int days = input.nextInt();
        String temp_today="";
        String temp_future="";

        int future = today + days;
        int future_day = future % 7;
    
        switch (future_day) {
        case 1: {
            temp_future = "Monday";
            break;
        }

        case 2: {
            temp_future = "Tuesday";
            break;
        }
        case 3: {
            temp_future = "Wednesday";
            break;
        }

        case 4: {
            temp_future = "Thursday";
            break;
        }
        case 5: {
            temp_future = "Friday";
            break;
        }
        case 6: {
            temp_future = "Saturday";
            break;
        }
        case 0: {
            temp_future = "Sunday";
            break;
        }

    }
        switch (today) {
        case 1: {
            temp_today = "Monday";
            break;
        }

        case 2: {
            temp_today = "Tuesday";
            break;
        }
        case 3: {
            temp_today = "Wednesday";
            break;
        }

        case 4: {
            temp_today = "Thursday";
            break;
        }
        case 5: {
            temp_today = "Friday";
            break;
        }
        case 6: {
            temp_today = "Saturday";
            break;
        }
        case 0: {
            temp_today = "Sunday";
            break;
        }
        }
        
        
        System.out.printf("Today is %s and the future day is %s",temp_today,temp_future);
    }
}
