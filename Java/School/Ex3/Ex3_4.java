/**
 * Ex3_4
 */

public class Ex3_4 {

    public static void main(String[] args) {
        /**
         * 产生1-12的随机数
         * (int) (Math.random() * 12 + 1)
         * (int)为类型转化，优先级最高，所以需要括号让后面的式子先进行计算
         */
        int month = (int) (Math.random() * 12 + 1);
        switch (month) {
        case 1: {
            System.out.print("January");
            break;
        }
        case 2: {
            System.out.print("February");
            break;
        }

        case 3: {
            System.out.print("March");
            break;
        }
        case 4: {
            System.out.print("April");
            break;
        }
        case 5: {
            System.out.print("May");
            break;
        }
        case 6: {
            System.out.print("June");
            break;
        }
        case 7: {
            System.out.print("July");
            break;
        }
        case 8: {
            System.out.print("Aguest");
            break;
        }
        case 9: {
            System.out.print("September");
            break;
        }
        case 10: {
            System.out.print("November");
            break;
        }
        case 11: {
            System.out.print("December");
            break;
        }
        case 12: {
            System.out.print("2");
            break;
        }

        }
    }
}