import java.util.*;
class MyDaemon extends Thread{
  public void run(){
    while (true){
       System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
    }
  }
}
public class DaemonTesting{
  public static void main(String[] args){
    MyDaemon daemon = new MyDaemon();
    daemon.setDaemon(true);
    daemon.start();
    
    System.out.println("Thread is running");
    try{
      Thread.sleep(2000);
    } catch (InterruptedException e){
      System.out.println(e.getMessage());
    }
    System.out.println("Main thread finished.");
  }
}
