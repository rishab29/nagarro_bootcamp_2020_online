package Lecture12;

public class PrintPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abc";
        printP(str,"");
	}
	
	public static void printP(String str,String res) {
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char cc=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			printP(ros, res+cc);
		}
	}

}
