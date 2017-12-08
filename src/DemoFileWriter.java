import java.io.*;

public class DemoFileWriter {

	public static void main(String[] args) {
		System.out.println("start DemoFileWriter");
		try(Writer writer = new FileWriter("resultfiles/DemoFileWriter.txt")) {
			
			writer.write("How are you?" + System.lineSeparator());
			writer.write("你好吗?" + System.lineSeparator());
			writer.write('你');
			writer.write('好');
			writer.flush();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println("end DemoFileWriter");
	}
}
