import java.io.*;

public class InputStreamToOutputStream {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream(
				"testfiles/DemoFileInputStream.txt");
				OutputStream os = new FileOutputStream(
						"resultfiles/inputToOutput.txt")) {
			for (int i = is.read(); i != -1; i = is.read()) {
				os.write(i);
			}
			os.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
