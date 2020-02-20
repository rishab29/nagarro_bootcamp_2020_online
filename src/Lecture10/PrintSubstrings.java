package Lecture10;

public class PrintSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		// H He Hel Hell Hello e el ell ello l ll llo l lo o
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		
	}

}
