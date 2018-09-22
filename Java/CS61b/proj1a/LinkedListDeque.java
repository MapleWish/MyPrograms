/**
 * LinkedListDeque
 */
public class LinkedListDeque {

    /**
     * Node
     */
    public class Node<T> {
        public Node pre;
        public Node next;
        public T item;

        public Node(Node p, Node n, T i) {
            pre = p;
            next = n;
            item = i;
        }
    }
    
    public Node<T> sentinel_pre;
    public Node<T> sentinel_next;

    public LinkedListDeque() {
        sentinel_pre = new Node<T>(null, null, 63);
        sentinel_next = new Node<T>(null, null, 63);
        sentinel_pre.next = sentinel_next;
        sentinel_next.pre = sentinel_pre;
    }
        
    
    public LinkedListDeque(T x) {
        sentinel_next.pre = sentinel_pre;
        sentinel_pre.next = new Node<T>(sentinel_pre, sentinel_pre.next, x);
        

    }
    
    public add(int x){

    }


}