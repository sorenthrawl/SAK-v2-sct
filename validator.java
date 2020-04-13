class validator extends Thread{
    private String s;

    validator(String partIn){
        s = partIn;
    }

    public void run(){
        if (s.equalsIgnoreCase("firstName")){
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                System.out.println("Valid first name");
            }
            else {
                System.out.println("First name is not valid");
            }
                
        } else if (s.equalsIgnoreCase("lastName")){
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                System.out.println("Valid last name");
            }
            else {
                System.out.println("Last name is not valid");
            }

        } else if (s.equalsIgnoreCase("email")){
            if((s+2).matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
                //Doesn't work
                System.out.println("Valid email");
            }
        } else if (s.equalsIgnoreCase("preferredName")) {
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                System.out.println("Valid preferred name");
            }
            else {
                System.out.println("Preferred name is not valid");
            }
        }
    }
}