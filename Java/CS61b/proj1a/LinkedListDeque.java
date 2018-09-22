/**
 * The generic placeholder must be the top of the class after the class name
 * And the generic placeholder can use the null to assign
 */
public class LinkedListDeque<T> {


    public class Node {
        public Node pre;
        public Node next;
        public T item;

        public Node(Node p, Node n, T i) {
            pre = p;
            next = n;
            item = i;
        }
        public Node() {
            pre = null;
            next = null;
            item = null;
        }
    }
    
    public Node sentinel_pre;
    public Node sentinel_next;

    public LinkedListDeque() {
        sentinel_pre = new Node();
        sentinel_next = new Node();
        sentinel_pre.next = sentinel_next;
        sentinel_next.pre = sentinel_pre;
    }
        
    
    public LinkedListDeque(T x) {
        sentinel_next.pre = sentinel_pre;
        sentinel_pre.next = new Node(sentinel_pre, sentinel_pre.next, x);
        

    }
    
  


}