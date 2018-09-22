/**
 * SSList
 */
public class SSList {

    public IntNode first;

    SSList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    
    public void addLast(int x) {
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    
    public int size(IntNode p) {

        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    /**Because the outside(static) can't access to the first
     * Outside can use the menthod ,but can't access to the variable directly
    */
    public int size() {
        return size(first);
    }

    public static void main(String[] args) {
        SSList L = new SSList(5);
        L.addFirst(10);
        L.addLast(100);
        System.out.print(L.size());
    }
}