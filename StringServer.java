import java.io.IOException;
import java.net.URI;

class Handle implements URLHandler {

    String record = "";

    public String handleRequest(URI url) {

        String path = url.getPath();
        String query = url.getQuery();

        if (path.equals("/add-message") && (query.split("=").length == 1)) {
            return record;
        }
        else if (path.equals("/")) {
            return record;
        }
        else {
            record += query.split("=")[1] + "\n";
            return record;
        }
        
    }
    
}


class StringServer {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {

            System.out.println("Missing port number! Try any number between 1024 to 49151");

            return;

        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handle());
    }

}



