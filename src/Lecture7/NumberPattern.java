package Lecture7;

public class NumberPattern {
	public static void main(String[] args) {
		
		int n=4;
		int rows=n;
		int row=1;
		int nsp=n-1;
		int nst=1;
		int value=1;
		
		while(row<=2*rows-1) {
			int i=1;
			while(i<=nsp) {
				System.out.print("\t");
				i++;
			}
			
			int j=1;
			while(j<=nst) {
				System.out.print(value+"\t");
				value++;
				j++;
			}
			 
			 if(row<n) {
				 nst=nst+2;
				 nsp--;
			 }else {
				 value=value-((2*nst)-2);
				 nst=nst-2;
				 nsp++;
			 }
			
			row++;
			System.out.println();
		}

	}

}
