import java.io.*;

/** @author calen */
public final class Make6MbFile {

	public static void main(String[] args) {
		try {
			System.out.println("making 6MB file");
			File oneMbFile = new File("testfiles/SixMbFile.txt");
			String line = "Test line. Test line. Test line. Test line. Test line. Test line. Test line.";
			FileWriter fw = new FileWriter(oneMbFile);
			PrintWriter pw = new PrintWriter(fw, false);
			
			for (int i = 0; i < 81707; ++i ) {
				pw.println(line);
			}
			
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
			
			System.out.println("done");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}