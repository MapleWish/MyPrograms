/**
 * IntList
 */
public class IntList {

    public int item;
    public IntList next;

    public IntList(int i, IntList n) {
        item = i;
        next = n;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        L.addList(4);
        System.out.print(L.size());
    }
    
    public void addList(int x) {
        next = new IntList(x, next);
    }
    
    public int size() {
        if (next == null) {
            return 1;
        }
        return next.size()+1;
    }

}