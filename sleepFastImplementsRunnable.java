import java.util.ArrayList;


public class sleepFastImplementsRunnable {
    public static void main(String[] args){
        System.out.println("SleepFastImplementsRunnable is starting.");
        long start = System.currentTimeMillis();

        //Shhhh the array is sleeping
        ArrayList<oneSecSleeperR> sleeperList = new ArrayList<oneSecSleeperR>();
        for (int i=1; i < 11; i++) {
            sleeperList.add(new oneSecSleeperR(i));
        }
        
        System.out.println("\nNon-threaded ArrayList sleep");
        start = System.currentTimeMillis();
        for (oneSecSleeperR s : sleeperList) {
            s.sleep();
        }
        System.out.println("Elapsed sleep time = " + (System.currentTimeMillis() - start));

        System.out.println("\nThreaded ArrayList sleep");
        ArrayList<Thread> threadList = new ArrayList<Thread>();
        for (oneSecSleeperR s: sleeperList) {
            threadList.add(new Thread(s));
        }

        start = System.currentTimeMillis();
        for (Thread t: threadList) {
            t.start();
        }

        try {
            for (Thread t: threadList) {
                t.join();
            }
        } catch (Exception e) {
            System.out.println("Exception + " + e);
        }
        System.out.println("Elapsed sleep time = " + (System.currentTimeMillis() - start));
    }
}