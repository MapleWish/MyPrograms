/**
 * Doglauch
 */
public class Doglauch {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[] { 1, 2, 3 };
        Dog d2 = new Dog(2);
        Dog d1 = new Dog(4);
        d1.maxDog(d2).makeNoise();
    }

}