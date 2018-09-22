/**
 * The static variable is in the static field which can be changed by any using the class's static variable
 * The static menthod is usually called by class name ,if called by instance ,it works as the static menthod (using the class name)
 * https://cscircles.cemc.uwaterloo.ca/java_visualize/#mode=display
 * You can run the code in the visual website
 */
public class Cat {
    public String name;
    public static String noise;
 
    public Cat(String name, String noise) {
       this.name = name;
       this.noise = noise;
    }
 
    public void play() {
       System.out.println(noise + " I'm " + name + " the cat!");
    }
 
    public static void anger() {
       noise = noise.toUpperCase();
    }
    public static void calm() {
       noise = noise.toLowerCase();
    }
    
    public static void main(String[] args) {
       Cat a = new Cat("Cream", "Meow!");
       Cat b = new Cat("Tubbs", "Nyan!");
       a.play();
       b.play();
       Cat.anger();
       a.calm();
       a.play();
       b.play();
    }
 }