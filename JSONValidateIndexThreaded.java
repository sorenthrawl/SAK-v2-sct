import java.util.ArrayList;

class validator extends Thread{
    private String s;
    private int total;

    validator(String partIn, int totIn){
        s = partIn;
        total = totIn;
    }

    public void run(){
        boolean lastName = false;
        boolean firstName = false;  
        boolean emailPresent = false;
        int countTotal = 0;
        int count = 0;

        if (s.equalsIgnoreCase("firstName")){
            firstName = true;
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                count += 2;
            }
                
        } else if (s.equalsIgnoreCase("lastName")){
            lastName = true;
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                count += 2;
            }

        } else if (s.equalsIgnoreCase("email")){
            emailPresent = true;
            if((s+2).matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
                count += 2;
            }

        } else if (s.equalsIgnoreCase("preferredName")) {
            if ((s+2).length() >= 2 && (s+2).length() <= 16){
                count += 2;
            }
        }
        System.out.println("It's running tho");
        countTotal++;
        if (countTotal == total){
            if (firstName && lastName && emailPresent && (count == 6 || count == 8)){
                System.out.println("This persons JSON file is valid.\n");
            }
            else {
                System.out.println("This persons JSON file is NOT valid.\n");
            }
        }
    }
}


public class JSONValidateIndexThreaded extends HttpRequest{
    //boolean lastName;
    //boolean firstName;  
    //boolean emailPresent;
    int total;
    //int countTotal = 0;
    //int count = 0;

    public Boolean validateIndexThr(){
        total = urlContent.size();
        for (final String line : urlContent) {
            parseNValLineThr(line);
        }
        return true;
    }

    private void parseNValLineThr(final String line) {

        final String[] stringPart = line.split("\"");
        ArrayList<validator> valList = new ArrayList<validator>();
        for (final String s : stringPart) {
            valList.add(new validator(s, total));
        }

        for (validator s : valList) {
            s.start();
        }
        
        
    }  
}