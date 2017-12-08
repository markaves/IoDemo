import java.io.*;

/** @author calenmartin */
public class DemoBufferedWriter {

	private static final File FILE = new File(
			"resultfiles/TestDemoBufferedOutputStream.txt");
	private static final int LOOPS = 1000000;
	private static final String STR = "Marunong na akong gumamit ng Streams!\n";

	private static void justFw() throws IOException {
		Writer writer = new FileWriter(FILE);

		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOPS; i = ++i) {
			writer.write(STR);
		}
		writer.flush();
		long end = System.currentTimeMillis();
		System.out.println("time, just fw: " + (end - start) + "ms");
		writer.close();
		FILE.delete();
	}

	private static void buffered() throws IOException {
		Writer writer = new BufferedWriter(new FileWriter(FILE)); // default 8192-char buffer

		long start = System.currentTimeMillis();
		for (int i = 0; i < LOOPS; i = ++i) {
			writer.write(STR);
		}
		writer.flush();
		long end = System.currentTimeMillis();
		System.out.println("time, buffered: " + (end - start) + "ms");
		writer.close();
		FILE.delete();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("start DemoBufferedWriter");
		justFw();
		buffered();
		System.out.println("end DemoBufferedWriter");
	}
}
