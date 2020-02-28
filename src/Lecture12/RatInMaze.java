package Lecture12;

public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= {{0,0,9,0},{0,0,9,0},{9,0,0,0},{0,9,0,0}};
        printPath(arr, 3, 3, 0, 0);
	}
	
	public static void printPath(int[][] arr,int er ,int ec,int cr,int cc) {
		if(er==cr&&ec==cc) {
			arr[cr][cc]=1;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("*************************");
		}
		
		if(cr>er||cc>ec) {
			return;
		}
		
		if(arr[cr][cc]==9) {
			return;
		}
		arr[cr][cc]=1;
		printPath(arr, er, ec, cr, cc+1);
		printPath(arr, er, ec, cr+1, cc);
		arr[cr][cc]=0;
	}

}
