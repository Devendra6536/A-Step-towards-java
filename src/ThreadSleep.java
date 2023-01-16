public class ThreadSleep extends  Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(500);
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        t1.start();
    }
}
