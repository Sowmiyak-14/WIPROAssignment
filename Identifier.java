public class Identifier {

	public static void main(String[] args) {
		String a = "roll_no";
		String s = "$_";
		String num = "0123456789";
		int i = 1;
		char ch = a.charAt(0);
		if ((ch >= 'a' || ch <= 'z') && (ch == 'A' || ch == 'Z') || (s.contains(ch + " "))) {
			System.out.println("Not an dentifier");
		}

		else {
			while (i <= a.length()) {
				if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
						|| s.contains(a.charAt(i) + "") || num.contains(a.charAt(i) + ""))
					break;
				i++;

			}
		}
		if (i == a.length()) {
			System.out.println("valid");
		}
	}

}