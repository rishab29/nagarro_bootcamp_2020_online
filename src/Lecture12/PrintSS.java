package Lecture12;

public class PrintSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printSS(str, "");
	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, res);
		printSS(ros, res + cc);

	}

}
