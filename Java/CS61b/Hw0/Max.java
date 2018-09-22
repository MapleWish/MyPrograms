/**
 * Max
 */
public class Max {

    public static void main(String[] args) {
        int max = 0;
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        max = max(numbers);
        System.out.print(max);
    }
    
    public static int max(int[] x) {
        int i=0;
        int max = x[0];    
        for (i = 1; i <= x.length - 1; i++) {

            if (x[i] >= x[i - 1]) {
                max = x[i];
            }
        }
        return max;
        
    }
}