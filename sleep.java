
public class sleep {
    public static void main(String[] args){
        System.out.println("Sleep is starting.");

        oneSecSleeper sleeper0 = new oneSecSleeper(0);
        oneSecSleeper sleeper1 = new oneSecSleeper(1);

        System.out.println("\nSleep");
        long start = System.currentTimeMillis();

        sleeper0.sleep();
        sleeper1.sleep();
        System.out.println("Elapsed sleep time = " + (System.currentTimeMillis() - start));
    }
}