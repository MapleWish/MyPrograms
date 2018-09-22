/**
 * Drawing_a_Triangle
 */
public class Drawing_a_Triangle {

    public static void main(String[] args) {
        int x = 5;
        drawingTriangle(x);
    }
    
    public static void drawingTriangle(int x) {
        for (int i=0; i <x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}