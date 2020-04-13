public class JSONValidateIndex extends HttpRequest{
    boolean lastName;
    boolean firstName;  
    boolean emailPresent;
    int total;
    int countTotal = 0;
    int count = 0;

    public Boolean validateIndex(){
        total = urlContent.size();
        for (final String line : urlContent) {
            parseNValLine(line);
        }
        return true;
    }

    private void parseNValLine(final String line) {

        final String[] stringPart = line.split("\"");

        if(stringPart.length > 1) {
            for (final String s : stringPart) {
                
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
            }
        }

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