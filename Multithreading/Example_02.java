package Multithreading;

public class Example_02  extends Thread{

    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                sleep(9);
                System.out.println("Thread: "  + Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println("Exception in Thread: " + e.getMessage());
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Example_02 thread = new Example_02();
        thread.start();
    }
}
