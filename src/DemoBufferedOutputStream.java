import java.io.*;

/** @author calenmartin */
public class DemoBufferedOutputStream {

	private static final File FILE = new File(
			"resultfiles/TestDemoBufferedOutputStream.txt");
	private static final int LOOPS = 1000000;
	private static final byte[] BYTES = "Marunong na akong gumamit ng Streams!\n"
			.getBytes();

	private static void justFos() throws IOException {
		OutputStream os = new FileOutputStream(FILE);

		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOPS; i = ++i) {
			os.write(BYTES);
		}
		os.flush();
		long end = System.currentTimeMillis();
		System.out.println("time, just FOS: " + (end - start) + "ms");
		os.close();
		FILE.delete();
	}

	private static void bufferedFos() throws IOException {
		OutputStream os = new BufferedOutputStream(new FileOutputStream(FILE)); // 0.5kB default buffer

		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOPS; i = ++i) {
			os.write(BYTES);
		}
		os.flush();
		long end = System.currentTimeMillis();
		System.out.println("time, buffered: " + (end - start) + "ms");
		os.close();
		FILE.delete();
	}


	public static void main(String[] args) throws IOException {
		System.out.println("start DemoBufferedOutputStream");
		justFos();
		bufferedFos();
		System.out.println("end DemoBufferedOutputStream");
	}
}
