import java.util.*;
class MyDaemon extends Thread{
  public void run(){
    while (true){
      System.out.println("Daemon thread running");
    try{
      Thread.sleep(1000);
    }catch (InterruptedException e){
      System.out.println(e.getMessage());
    }
  }
}
}

class MainThread extends Thread{
  public void run(){
    for(int i = 0; i<=100; i++){
      System.out.println("Main thread running");
    }
    try{
      Thread.sleep(2000);
    }catch (InterruptedException e){
      System.out.println(e.getMessage());
    }
  }
}

public class DaemonAndMain{
  public static void main(String[] args){
    MyDaemon d1 = new MyDaemon();
    MainThread t1 = new MainThread();
    d1.setDaemon(true); 
    d1.start();
    t1.start();
  }
}