/**
 * Generic class ,which can use the <kindname> as holdplace to complish the class and define variable:
 *         public class SSList<kindname> ....
 *         kindname x;
 * 
 * It means we can using any type(the primitive type like 
 * Inter,Integer, Double, Character, Boolean, Long, Short, Byte ,String
 * To replace the "kindname",When stablish the instance
 *          SSList<String> x = new SSList<String> ("happy")
 * 
 * The Generic setting must be the top of the class;
 */
public class SSList<Fuck> {
    public class IntNode {

        Fuck item;
        IntNode next;

        public IntNode(Fuck i, IntNode n) {
            item = i;
            next = n;

        }
    }

    public IntNode first;/**first is the middle */

    public SSList(Fuck x) {
        first = new IntNode(x, null);

    }

    public SSList() {
        first = null;
    }

    public void addfirst(Fuck x) {
        first = new IntNode(x, first);

    }

    public Fuck getfirst() {
        return first.item;
    }

    public void addlast(Fuck x) {
        if (first == null) {
            first = new IntNode(x, null);
            return;
        }
    }
}