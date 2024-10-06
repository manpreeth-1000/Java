import java.util.LinkedList;

public class p54 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(0);
        list.addFirst(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
