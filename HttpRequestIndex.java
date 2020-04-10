public class HttpRequestIndex extends HttpRequest {
    public Boolean parseIndex(){
        for (final String line : urlContent){
            parseLine(line);
        }
        return true;
    }

    private void parseLine(final String line) {
        System.out.println("\nParsing: " + line);

        final String[] stringPart = line.split("\"");
       
        if(stringPart.length > 0) {
            int n = 0;
            for (final String s : stringPart) {
                System.out.println("Substring: " +n+ " = " +s);
                n++;
            }
        }
    }
}