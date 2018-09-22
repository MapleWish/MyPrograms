/**
 * When we creat a empty Node and using the addlast method ,we get crash
 * Because the first==null,the addlast using the first.next is error
 * There are two ways to handle it:
 * 
 * THE FIRST :
 * addfirst include the situation where the first==null
 * 
 * THE SECOND:
 * modify the prograss the method BY USING THE Sentinel Node to avoid any bug situation
 * 
 * The second seems more complicate than first ,but I can handle the errors easily(autoly),
 * you needn't think the crash situation .It much easier to avoid when get more complex promble/structure
 * The Sentinel like the invariants to reason your code 
 */




                                /*THE Second WAY*/
public class SSList {

    public IntNode Sentinel;

    

    public SSList(int x) {
        Sentinel = new IntNode(98,null);
        Sentinel.next = new IntNode(x, null);

    }

    public SSList() {
        Sentinel = new IntNode(98, null);
    }

    public void addfirst(int x) {
        Sentinel.next = new IntNode(x, Sentinel.next);

    }

    public int getfirst() {
        return Sentinel.next.item;
    }

    public void addlast(int x) {
            IntNode p = Sentinel;/*note the sentinel.next because there may only the sentinel*/
            while (p.next != null) {
                p = p.next;
            }
            p.next = new IntNode(x, null);
        }
    

    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1+size(p.next);
    }
    
    public int size() {
        return size(Sentinel.next);
    }
    public static void main(String[] args) {
        SSList x = new SSList();
        x.addlast(20);
        System.out.print(x.size());

    }
}
                                