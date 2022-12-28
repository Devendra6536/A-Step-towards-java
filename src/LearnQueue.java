import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(100);
        q.offer(1000);
        q.offer(10000);
        q.offer(100000);
        System.out.println(q);;


        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.add(985));
        System.out.println(q.add(995));
        System.out.println(q);
        System.out.println(q.peek());
        while(q.size()!=0){
            System.out.print(q.poll()+" ");
        }

    }
}
