import java.io.*;
import java.net.*;

public class WriteToUrlConnection {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://ph.search.yahoo.com/search");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);

		try (OutputStream out = connection.getOutputStream();
				InputStream in = connection.getInputStream()) {
			out.write("p=cat".getBytes());
			out.flush();

			for (int i = in.read(); i > 0; i = in.read()) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
