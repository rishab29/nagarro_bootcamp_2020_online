package Lecture13;

public class printKeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad("123", "");
	}

	public static void printKeypad(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		String code = codes(ch);
		for (int i = 0; i < code.length(); i++) {
			char gc = code.charAt(i);
			printKeypad(ros, res + gc);
		}

	}

	public static String codes(char ch) {
		if (ch == '1') {
			return "abc";
		}
		if (ch == '2') {
			return "def";
		}
		if (ch == '3') {
			return "ghi";
		}
		if (ch == '4') {
			return "jkl";
		}
		if (ch == '5') {
			return "mno";
		}
		if (ch == '6') {
			return "pqr";
		}
		if (ch == '7') {
			return "stu";
		}
		if (ch == '8') {
			return "vwx";
		}
		if (ch == '9') {
			return "yz";
		}

		return null;

	}

}
