class oneSecSleeper {
    private int sleepNumber;

    oneSecSleeper(int sleepNumIn){
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
}