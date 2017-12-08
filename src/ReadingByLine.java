import java.io.*;

public class ReadingByLine {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("testfiles/DemoFileInputStream.txt"))) {
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
