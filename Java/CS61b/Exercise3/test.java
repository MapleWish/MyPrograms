public class test {
    public static void windowPosSum(int[] a, int n) {
        int i;
        for(i=0;i<a.length;i++)
        {
            int temp=0;
            if (a[i] > 0) {
                for( int step=0;step<=n&&step+i<=a.length-1;step++)
                {
                    temp = temp + a[step+i];
                }
                    a[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, 5, 4 };
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        /**
         * For 循环加强 
         * 使用for(string s : a)
         * 意味着s依次代表着a[0],a[1]...a[a.length-1];
         */

        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }                
            }
        }
    }
}