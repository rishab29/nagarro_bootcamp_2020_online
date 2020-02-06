package Lecture6;

import java.util.Scanner;

public class CountNumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // '$'
		
		int count=0;
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		while(ch!='$') {
			count++;
			ch=s.next().charAt(0);
		}
		
		System.out.println(count);
	}

}
