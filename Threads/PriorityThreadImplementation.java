import java.util.*;

class PriorityThreads1 implements Runnable{
  public void run(){
    for(int i= 0; i<10; i++){
      System.out.println("Thread1");
      try{
        Thread.sleep(500);
      } catch (InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
}

class PriorityThreads2 implements Runnable{
  public void run(){
    for(int i= 0; i<10; i++){
      System.out.println("Thread2");
      try{
        Thread.sleep(200);
      } catch (InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
}

class PriorityThreads3 implements Runnable{
  public void run(){
    for(int i= 0; i<10; i++){
      System.out.println("Thread3");
      try{
        Thread.sleep(700);
      } catch (InterruptedException e){
        System.out.println(e.getMessage());
      }
    }
  }
}
    

public class PriorityThreadImplementation {
  public static void main (String[] args){
    PriorityThreads1 thread1 = new PriorityThreads1();
    PriorityThreads2 thread2 = new PriorityThreads2();
    PriorityThreads3 thread3 = new PriorityThreads3();
    Thread t1 = new Thread(thread1);
    Thread t2 = new Thread(thread2);
    Thread t3 = new Thread(thread3);
    
    t1.setPriority(Thread.MIN_PRIORITY);  
    t2.setPriority(Thread.NORM_PRIORITY); 
    t3.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
  }
    
    
}