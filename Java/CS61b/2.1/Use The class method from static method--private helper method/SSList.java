/**
 * SSList decreat the IntNode 
 * 
 * SSList class acts as a middle man between user and the naked recursive data structure .
 * Allow us to store meta information about entire list,e.g.size
 * 
 * The first appoint the IntNode's address
 * Because the L.'s special feature ,we cann't use the L as the variable in the method
 * Thus the SSList does handle this problem by include the first variable as the L 
 * 
 *  SSList structure isn't the recursion class for SSList class having no SSList pointers
 *  But we can creat meta in the SSList which recode it e.g size
 * or creat private menthod to use the meta e.g. size()
 * 
 * SSList not only do the naked IntList job ,but also can do more by the SSList middle(first),
 * which is so-called "programing oritend to the target"
 */
public class SSList {
  
    public IntNode first;

    public SSList(int x) {
        first = new IntNode(x, null);

  }

    public SSList() {
        first = null;
    }

    public void addfirst(int x) {
        first = new IntNode(x, first);

    }

    public int getfirst() {
        return first.item;
    }

    public void addlast(int x) {
        if (first == null) {
            first = new IntNode(x, null);
            return;
        }
            IntNode p = first;
            while (p.next != null) {
                p = p.next;
            }
            p.next = new IntNode(x, null);
        }
    
    
    /*public int size() {
        IntNode p = first;
        int x ;
        for (x = 1; p.next != null; x++) {
            p = p.next;
        }
        return x;
    }*/

    /** private helper method */
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1+size(p.next);
    }
    
    public int size() {
        return size(first);
    }
    public static void main(String[] args) {
        SSList x = new SSList();
       
        x.addlast(20);
        System.out.print(x.size());

    }
}