class Multi extends Thread{
    public  void run(){
        System.out.println("Running");
    }
}
class Multiprogramming {
    public  void run(){
        System.out.println("The Thread is running ");
    }
}
class MultiProg implements  Runnable{
    public void run(){
        System.out.println("Running");
    }
}
public class MultiThreading implements Runnable{

    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {

        MultiThreading m = new MultiThreading();
        Thread t1 = new Thread(m);
        t1.start();
        System.out.println(t1.getId()+" "+t1.getName());


        System.out.println();
        Multi m1 = new Multi();
        m1.start();
        System.out.println(m1.getId()+" "+m1.getName());
        System.out.println();
        Thread t2 = new Thread("This is my day of threading");
        t2.start();
        System.out.println(t2.getId()+" "+t2.getName());

        Runnable r = new MultiProg();
        Thread t3 = new Thread(r,"Hello");
        t3.start();
        System.out.println(t3.getId()+" "+t3.getName()+t3.getPriority());
    }

}
