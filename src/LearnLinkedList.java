import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(15);
        l.add(25);
        l.add(35);
        l.add(45);
        l.add(55);

        System.out.println(l);
        l.remove();
        System.out.println(l);
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(100);
        l1.add(90);
        l1.add(80);
        l1.add(854);

        l.addAll(l1);
        System.out.println(l);
        System.out.println(l.size());
        l.remove(Integer.valueOf(854));
        System.out.println(l);
        System.out.println(l.contains(80));
        l.clear();
        System.out.println(l+" And Size is " + l.size());
    }
}
