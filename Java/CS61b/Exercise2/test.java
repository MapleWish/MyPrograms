/**
 * time:22:22
 */
public class test {
    public static void main(String[] args) {
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        System.out.print(forMax(numbers));
    }
    public static int max(int []m)
    {
        int max, i;
        i = 1;
        max = m[0];
        while (i < m.length) {
            if (m[i - 1] < m[i]) {
                max = m[i];
            }
            i = i + 1;

        }
        return max;
    }

    public static int forMax(int[] m) {
        int max = m[0];
        for (int i = 1; i < m.length; i++)
        {
            if (m[i - 1] < m[i]) {
                max = m[i];
            }
        }
        return max;
    }
}