import java.io.*;
import java.net.*;

public class BufferedInputStreamFromWeb {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.yahoo.co.jp");
		try (InputStream is = new BufferedInputStream(url.openStream())) {
			for (int i = is.read(); i > 0; i = is.read()) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
