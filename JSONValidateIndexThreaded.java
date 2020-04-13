import java.util.ArrayList;

public class JSONValidateIndexThreaded extends HttpRequest{

    public Boolean validateIndexThr(){
        for (final String line : urlContent) {
            parseNValLineThr(line);
        }
        return true;
    }

    private void parseNValLineThr(final String line) {

        final String[] stringPart = line.split("\"");
        ArrayList<validator> valList = new ArrayList<validator>();

        for (final String s : stringPart) {
            valList.add(new validator(s));
        }

        for (validator s : valList) {
            s.start();
        }
    }  
}