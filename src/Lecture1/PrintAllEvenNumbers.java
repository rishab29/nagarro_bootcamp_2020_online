package Lecture1;

import java.util.Scanner;

public class PrintAllEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=2;i<=n;i++) {
        	if(i%2==0) {
        		System.out.println(i);
        	}
        }
	}

}
