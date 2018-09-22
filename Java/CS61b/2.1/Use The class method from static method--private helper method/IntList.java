/**
 * IntListGet
 * 递归函数 是在使用之后再最后返回的 （走到最里面，然后从最里面一步一步返回）
 * 递归需要basecase（基准/结束条件） 在Size 中为 this.rest == null
 */
public class IntList {

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.print(L.size());
    }

    public int first;
    public IntList rest;
    
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }
}