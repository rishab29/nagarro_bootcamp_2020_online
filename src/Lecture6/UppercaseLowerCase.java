package Lecture6;

import java.util.Scanner;

public class UppercaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		char ch = s.next().charAt(0);
		if (ch >= 97 && ch <= 122) {
			System.out.println("Lowercase");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("Uppercase");
		} else {
			System.out.println("Invalid");
		}

	}

}
