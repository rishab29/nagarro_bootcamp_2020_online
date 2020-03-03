package Lecture13;

public class SudukoSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
				          { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
				          { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				          { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
				          { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, 
				          { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				          { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
				          { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
				          { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		int n = 9;
		boolean[][] fixedcells=new boolean[n][n];
		setfixedcells(board,fixedcells,n);
		boolean ans=sudukosolver(board,fixedcells,0,0,n);
		if(ans) {
			printBoard(board);
		}else {
			System.out.println("Can't solve");
		}
	}
	
	public static boolean sudukosolver(int[][] board,boolean[][] fixedcells,int row,int col,int n) {
		if(row==n) {
			return true;
		}
		if(col==n) {
			return sudukosolver(board, fixedcells, row+1,0, n);
		}
		if(fixedcells[row][col]) {
			return sudukosolver(board, fixedcells, row, col+1, n);
		}
		for(int setnum=1;setnum<=n;setnum++) {
			boolean check=canplace(board, row, col, n, setnum);
			if(check) {
				board[row][col]=setnum;
				boolean solverest=sudukosolver(board, fixedcells, row, col+1, n);
				if(solverest) {
					return true;
				}else {
					board[row][col]=0;
				}
			}
		}
		return false;
	}
	
	public static boolean canplace(int[][] board,int row,int col,int n,int setnum) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == setnum) {
				return false;
			}
			if (board[row][i] == setnum) {
				return false;
			}
		}

		// check number present in cells
		int sqrtN = (int) Math.sqrt(board.length);
		int startRow = (row / sqrtN) * sqrtN;
		int startCol = (col / sqrtN) * sqrtN;
		for (int i = startRow; i < startRow + sqrtN; i++) {
			for (int j = startCol; j < startCol + sqrtN; j++) {
				if (board[i][j] == setnum) {
					return false;
				}
			}
		}

		return true;
	}

	public static void setfixedcells(int[][] board,boolean[][] fixedcells,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]!=0) {
					fixedcells[i][j]=true;
				}
			}
		}
	}
	

	public static void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
