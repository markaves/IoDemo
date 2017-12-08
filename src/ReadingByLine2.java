import java.io.*;

public class ReadingByLine2 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
				new FileReader("testfiles/DemoFileInputStream.txt"))) {
			
			br.lines().forEach(System.out::println);
			
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
