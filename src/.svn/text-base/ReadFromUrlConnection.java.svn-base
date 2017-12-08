import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;


/** @author calenmartin */
public class ReadFromUrlConnection {

    public static void main(String[] args) throws Exception {
        URL website = new URL("http://www.google.com/");
        URLConnection yc = website.openConnection();
        BufferedReader in = new BufferedReader(
        		new InputStreamReader(yc.getInputStream()));

        for (String inputLine = in.readLine(); inputLine != null; inputLine = in.readLine()) {
            System.out.println(inputLine);
        }
        in.close();
    }

}
