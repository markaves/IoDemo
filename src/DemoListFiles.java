import java.io.*;

/** @author calenmartin */
public class DemoListFiles {
	
	private static final File DIR = new File("testfiles/dir");
	
	private static void list() {
		String[] names = DIR.list();
		System.out.println("\nFile.list():");
		for (int i = 0; i < names.length; ++i) {
			System.out.println('\t' + names[i]);
		}
	}
	
	private static void listWithFilter() {
		String[] names = DIR.list(new FilenameFilter() {
			@Override
			public boolean accept (File dir, String name) {
				return (name.endsWith(".xml") || name.endsWith(".xslt"));
			}
		});
		System.out.println("\nFile.list(FilenameFilter):");
		for (int i = 0; i < names.length; ++i) {
			System.out.println('\t' + names[i]);
		}
	}

	public static void main(String[] args) {
		list();
		listWithFilter();
	}
	
}
