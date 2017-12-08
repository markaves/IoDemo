import java.io.*;
import java.net.*;

public class ReadFromUrl {

	public static void main(String[] args) throws IOException {
		URL urlYahoo = new URL("http://www.yahoo.co.jp/");
		try (Reader in = new InputStreamReader(urlYahoo.openStream())) {

			for (int i = in.read(); i > 0; i = in.read()) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
