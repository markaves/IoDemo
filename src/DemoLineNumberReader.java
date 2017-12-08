import java.io.*;

public class DemoLineNumberReader {

	public static void main(String[] args) {
		try (LineNumberReader lnr = new LineNumberReader(new FileReader(
				"testfiles/DemoFileInputStream.txt"))) {
			lnr.setLineNumber(2);

			while (lnr.ready()) {
				System.out.print("\nline #" + lnr.getLineNumber() + ": ");
				System.out.print(lnr.readLine());
			}


		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
