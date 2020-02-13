package Lecture7;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int row=1;
        int cols=n;
        
        while(row<=n) {
        	int col=1;
        	while(col<=cols) {
        		System.out.print((char)(64+col));
        		col++;
        	}
        	
        	col--;
        	while(col!=0) {
        		System.out.print((char)(64+col));
        		col--;
        	}
        	row++;
        	cols--;
        	System.out.println();
        }
	}

}
