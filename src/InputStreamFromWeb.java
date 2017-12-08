import java.io.*;
import java.net.*;

public class InputStreamFromWeb {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.yahoo.co.jp");
		try (InputStream stream = url.openStream()) {
			for (int i = stream.read(); i > 0; i = stream.read()) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
