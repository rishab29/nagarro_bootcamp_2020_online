package Lecture6;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fmin=0,fmax=300;
		int fstep=20;
		
		while(fmin<=fmax) {
			int celsius=(int)((5.0/9)*(fmin-32));
			System.out.println(fmin+"\t"+celsius);
			fmin=fmin+fstep;
		}

	}

}
