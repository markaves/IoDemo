import java.io.*;
import java.net.*;

public class BufferedReadFromUrl {

	public static void main(String[] args) throws IOException {
		URL urlYahoo = new URL("http://www.yahoo.co.jp/");
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(urlYahoo.openStream()))) {

			while (in.ready()) {
				System.out.println(in.readLine());
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
