import java.io.*;

/** @author calen */
public final class Make1MbFile {

	public static void main(String[] args) {
		try {
			System.out.println("making 1MB file");
			File oneMbFile = new File("testfiles/OneMbFile.txt");
			String line = "Test line. Test line. Test line. Test line. Test line. Test line. Test line.";
			FileWriter fw = new FileWriter(oneMbFile);
			PrintWriter pw = new PrintWriter(fw, false);
			
			for (int i = 0; i < 13618; ++i ) {
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
