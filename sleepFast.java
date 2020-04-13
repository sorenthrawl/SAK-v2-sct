import java.util.ArrayList;


public class sleepFast {
    public static void main(String[] args){
        System.out.println("SleepFast is starting.");
        long start = System.currentTimeMillis();
        // Sleeping ArrayList
        ArrayList<oneSecSleeperT> sleeperList = new ArrayList<oneSecSleeperT>();
        for (int i=1; i < 11; i++) {
            sleeperList.add(new oneSecSleeperT(i));
        }

        System.out.println("\nNon-threaded ArrayList sleep");
        start = System.currentTimeMillis();
        for (oneSecSleeperT s : sleeperList) {
            s.sleep();
        }
        System.out.println("Elapsed sleep time = " + (System.currentTimeMillis() - start));

        System.out.println("\nThreaded ArrayList sleep");
        start = System.currentTimeMillis();
        for (oneSecSleeperT s: sleeperList) {
            s.start();
        }

        try {
            for (oneSecSleeperT s: sleeperList) {
                s.join();
            }
        } catch (Exception e) {
            System.out.println("Exception + " + e);
        }
        System.out.println("Elapsed sleep time = " + (System.currentTimeMillis() - start));
    }
}