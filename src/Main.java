import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(110);
        arr.add(20);
        arr.add(80);
        arr.add(70);

        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.remove(Integer.valueOf(110));
        System.out.println(arr);

        System.out.println("ArrayList Traversing Through Traditional way");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        System.out.println("ArrayList Traversing Through ForEach loop");
        for(Integer element:arr){
            System.out.println("Element is "+ element);
        }

        System.out.println("ArrayList Traversing Through Iterator ");
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
