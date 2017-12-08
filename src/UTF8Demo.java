public class UTF8Demo {

	public static void main(String[] args) {
		// ASCII
		System.out.println("A".getBytes().length); // 1
		// Arabic, Greek, Hebrew, etc. 
		System.out.println("غ".getBytes().length); // 2
		// Chinese, Japanese, Korean
		System.out.println("五".getBytes().length); // 3
		// Rare characters
		System.out.println("𝝏".getBytes().length); // 4
	}
}
