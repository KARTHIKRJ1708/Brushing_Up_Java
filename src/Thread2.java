public class Thread2 implements Runnable{
    @Override
    public void run() {
        String s2[]= {"4","5","6"};
        for(String s:s2){
            System.out.println(s);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread from Runnable interface");
    }
}
