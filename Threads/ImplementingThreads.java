import java.lang.*;

class MyThread extends Thread { 
    @Override
    public void run() { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 

public class ImplementingThreads { 
    public static void main(String[] args) { 
        MyThread thread1 = new MyThread(); 
        thread1.start(); /
    } 
}
