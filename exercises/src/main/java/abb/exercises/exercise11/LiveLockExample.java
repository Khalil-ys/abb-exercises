package abb.exercises.exercise11;

public class LiveLockExample {

    static Object lock1=new Object();
    static Object lock2=new Object();

    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            while (true){
                synchronized (lock1){
                    System.out.println("Thread 1 acquired lock1");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread 1 acquired lock2");
                    }
                }
            }
        });
        Thread thread2=new Thread(()->{
            while (true){
                synchronized (lock2){
                    System.out.println("Thread 2 acquired lock2");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("Thread 2 acquired lock1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
