class oneSecSleeperT extends Thread{
    private int sleepNumber;

    oneSecSleeperT(int sleepNumIn){
        sleepNumber = sleepNumIn;
    }

    public void sleep(){
        System.out.println(sleepNumber + " - Going to sleep");

        try {
            Thread.sleep(1000); //Sleep for 1 second
        } catch (Exception e) {
            System.out.println("Exception + " + e);
        }
        System.out.println("--" + sleepNumber + " - Waking up!!");
    }

    public void run(){
        sleep();
    }
}