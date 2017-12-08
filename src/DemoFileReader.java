import java.io.*;

public class DemoFileReader {

	public static void main(String[] args) {
		try (Reader reader = new FileReader(
				"testfiles/DemoFileInputStream.txt")) {

			for (int i = reader.read(); i != -1; i = reader.read()) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
