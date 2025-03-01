import java.lang.*;

class Thread1 extends Thread {
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("Thread 1");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.println("Thread 2");

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading{
    public static void main(String[] args){
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}
