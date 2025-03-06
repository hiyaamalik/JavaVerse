import java.util.*;

class HelloWorld implements Runnable{
  public void run(){
    for(int i= 0; i<=4; i++){
      System.out.println("Hello World");
      
      try{
        Thread.sleep(500);
      } catch(InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
}

public class HelloWorldThread {
  public static void main (String[] args){
    HelloWorld hwt = new HelloWorld();
    
    Thread thread = new Thread(hwt);
    
    thread.start();
  }
    
    
}