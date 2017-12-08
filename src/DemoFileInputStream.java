import java.io.*;

/** @author calenmartin */

public class DemoFileInputStream {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream(
				"testfiles/DemoFileInputStream.txt")) {
			for (int i = is.read(); i != -1; i = is.read()) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
