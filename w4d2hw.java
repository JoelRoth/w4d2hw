package w4d2hw;

public class w4d2hw {

	public static void main(String[] args) {
		String str = "ailweurhthfsdlkuh";
		Checkdupes(str);
	}
	public static boolean Checkdupes(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				char d = str.charAt(j);
				if (c == d) {
					System.out.println("DUPLICATES!");
					return true;
				}
					
			}
		}
		System.out.println("NO DUPLICATES!");
		return false;
	}
}
