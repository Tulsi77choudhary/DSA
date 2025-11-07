package Multithreading;

public class Example_01 { 
    public static void main(String[] args) {

        Runnable runnable1 = new MyThread1();
        Runnable runnable2 = new MyThread2();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        
    }
    
}

class MyThread1 implements  Runnable {
    public void run() {
        for(int i = 0; i < 5 + 1; i++){
            try{
               System.out.println("Thread 1: " + i);
            }catch(Exception e){
                System.out.println("Exception in Thread 1: " + e.getMessage());
            }
        }
    }
}

class MyThread2 implements Runnable {
    public void run(){
        for(int i = 0;i < 5; i++){
            try{
                System.out.println("Thread 2: " + i);
            }catch(Exception e){
                System.out.println("Exception in Thread 2: " + e.getMessage());
            }
        }
    }
} 