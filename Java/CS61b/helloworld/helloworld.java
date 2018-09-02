
public class helloworld {
    public static void drawTriangle(int N) {
        int x, y;
        x = 0;
        y = 0;
        while (x <= N) {
            y = 0;
            while (y <= x) {
                System.out.print("*");
                y = y + 1;
            }
            System.out.println("");
            x = x + 1;
        }

    }

    public static void main(String[] args) {

        drawTriangle(10);
        int[] numbers = new int[] { 4, 7, 10 };
        System.out.print(numbers[1]);

    }
}