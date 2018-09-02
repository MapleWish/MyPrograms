public class Dog {
    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;//要进行其他方法（makeNoise）需要在类里面传值
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }    
    }
}