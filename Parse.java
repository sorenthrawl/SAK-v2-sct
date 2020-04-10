public class Parse {
    public static void main (final String[] args) {
        System.out.println("Starting Parse");

        HttpRequestIndex indexRequest = new HttpRequestIndex();
        if (indexRequest.readURL("my website link")) {
            System.out.println(indexRequest);
            indexRequest.parseIndex();
        }
    }
}