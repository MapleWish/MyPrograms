public class TestPlanet {
    /**
     * 静态方法只能有实例，并且只能使用此静态方法自己定义的变量（自闭）
     */

        public static void main(String[] args) {
            Planet huoxing = new Planet(5, 5, 6, 6, 100, "jupiter.gif");
            Planet mingwang = new Planet(10, 22, 2, 2, 10, "jupiter.gif");
        double force = huoxing.calcForceExertedBy(mingwang);
            System.out.print(force);
        }
    
}