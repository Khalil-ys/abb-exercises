package abb.exercises.exercise11;

public class StarvationExample {

    static Object resurs=new Object();
    public static void main(String[] args){
        Thread greedyThread=new Thread(()->{
            while (true){
                synchronized (resurs){
                    System.out.println("Gready thread acquired resources");
                }
            }
        });
        Thread normalThread=new Thread(()->{
            while (true){
                synchronized (resurs){
                    System.out.println("Normal thread acquired resources");
                }
            }
        });
        greedyThread.setPriority(Thread.MAX_PRIORITY);
        normalThread.setPriority(Thread.NORM_PRIORITY);

        greedyThread.start();
        normalThread.start();
    }
}
