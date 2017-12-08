import java.io.*;

/** @author calenmartin */
public class DemoBufferedInputStream {

	private static final File FILE = new File("testfiles/SixMbFile.txt");

	private static void justFis() throws IOException {
		InputStream is = new FileInputStream(FILE);

		long start = System.currentTimeMillis();
		for (int i = is.read(); i != -1; i = is.read()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("time, just FIS: " + (end - start) + "ms");
		is.close();
	}

	private static void bufferedFis() throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(FILE)); // default

		long start = System.currentTimeMillis();
		for (int i = is.read(); i != -1; i = is.read()) {
		}
		long end = System.currentTimeMillis();
		System.out.println("time, buffered: " + (end - start) + "ms");
		is.close();
	}


	public static void main(String[] args) throws IOException {
		justFis();
		bufferedFis();
	}
}
