import java.io.*;

/** @author calenmartin */
public class FileCreate {

	public static void main(String[] args) {
		System.out.println("start FileCreate");
		try {
			File file = new File("resultfiles/newfile.txt");
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end FileCreate");
	}
}
