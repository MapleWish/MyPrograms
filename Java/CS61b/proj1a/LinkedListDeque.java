
/**
 * The generic placeholder must be the top of the class after the class name
 * And the generic placeholder can use the null to assign
 */
public class LinkedListDeque<T> {


    public class Node {
        public Node pre;
        public Node next;
        public T item;

        public Node(Node p,Node n,T x){
            pre= p;
            next = n;
            item = x;
        }
    }
    
    public Node sentinel_pre;
    public Node sentinel_next;
    private int size;

    public LinkedListDeque() {
        sentinel_pre = new Node(null,null,null);
        sentinel_next = new Node(null,null,null);
        sentinel_pre.next = sentinel_next;
        sentinel_next.pre = sentinel_pre;
        size = 0;
        
    }
        
    
    public LinkedListDeque(T x) {
        sentinel_pre = new Node(null, null, null);
        sentinel_next = new Node(null, null, null);
        sentinel_pre.next = new Node(sentinel_pre, sentinel_next, x);
        sentinel_next.pre = sentinel_pre.next;
        size += 1;
    }
    
    public void addFirst(T x) {
        Node newNode = new Node(null, null, x);
        sentinel_pre.next.pre = newNode;
        newNode.next = sentinel_pre.next;
        newNode.pre = sentinel_pre;
        sentinel_pre.next = newNode;
        size += 1;
    }

    public void addLast(T x) {
        Node newNode = new Node(null, null, x);
        sentinel_next.pre.next = newNode;
        newNode.pre = sentinel_next.pre;
        newNode.next = sentinel_next;
        sentinel_next.pre = newNode;
        size += 1;
    }

    public int size(){
        return size;
    }

    public T get(int i) {
        Node p = sentinel_pre;
        while(i!=0){
            p=p.next;
            i-=1;
        }
        return p.next.item;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else return false;
    }

    public void printDeque(){
        for(int i=0;i<size;i++){
            System.out.print(get(i));
        }
    }

    public T removeFirst(){
        sentinel_pre.next.pre=sentinel_pre;
        sentinel_pre = sentinel_pre.next;
        size -=1;
        if(size==0){
            return null;
        }
        else return sentinel_pre.next.item;
    }
}