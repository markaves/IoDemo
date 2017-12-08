import java.io.*;

public class DemoFileOutputStream {

	public static void main(String[] args) {
		System.out.println("start DemoFileOutputStream");
		try (OutputStream os = new FileOutputStream(
				"resultfiles/DemoFileOutputStream.txt")) {

			os.write("ABC".getBytes());
			os.write("你好吗".getBytes());
			os.write('A');
			os.write('B');
			os.write('C');
			os.write('你');
			os.write('好');
			os.write('吗');

			os.flush();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println("end DemoFileOutputStream");
	}
}
