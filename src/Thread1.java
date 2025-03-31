public class Thread1 extends Thread{

    public void run(){
        String s1[] = {"1","2","3"};

       for (String s:s1){
           System.out.println(s);
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }

        System.out.println("Running Thread from extends class");
    }
}
