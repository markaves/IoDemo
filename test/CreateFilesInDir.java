import java.io.*;

/** @author calenmartin */
public class CreateFilesInDir {

	public static void main(String[] args) {
		System.out.println("start CreateFilesInDir");
		try {
			String[] names = {"calen.xml", "melvin.xml", "migs.txt",
					"jared.xslt", "marie.txt", "donald.xslt", "jenny.txt",
					"jojo.xml", "abby.xslt"};
			File dir = new File("testfiles/dir");
			for (int i = 0; i < names.length; ++i) {
				new File(dir, names[i]).createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end CreateFilesInDir");
	}
}
