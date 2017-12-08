import java.io.*;

/** @author calenmartin */
public class DemoBufferedReader {

	private static final File FILE = new File("testfiles/SixMbFile.txt");

	private static void justFr() throws IOException {
		Reader reader = new FileReader(FILE);

		long start = System.currentTimeMillis();
		for (int i = reader.read(); i != -1; i = reader.read()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("time, just FileReader: " + (end - start) + "ms");
		reader.close();
	}

	private static void buffered() throws IOException {
		Reader reader = new BufferedReader(new FileReader(FILE)); // default 8192-char buffer

		long start = System.currentTimeMillis();
		for (int i = reader.read(); i != -1; i = reader.read()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("time, buffered: " + (end - start) + "ms");
		reader.close();
	}

	public static void main(String[] args) throws IOException {
		justFr();
		buffered();
	}
}
