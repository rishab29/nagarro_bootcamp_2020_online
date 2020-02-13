package Lecture7;

public class FunctionsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // helloFun();
       // helloFun();
		int p=2000;
		int r=10;
		int t=1;
		int si=simpleInterest(p,r,t);
		System.out.println(si);
	}
	
	public static void helloFun() {
		System.out.println("HelloFun");
	}
	
	public static int simpleInterest(int p,int r,int t) {
		int si=(p*r*t)/100;
		return si;
	}
	
	

}
