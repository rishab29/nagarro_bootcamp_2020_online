package Lecture24;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=5;
           int[] strg=new int[n+1];
		   System.out.println(fib(n));
		   System.out.println(fibRS(n, strg));
		   System.out.println(fibIS(n));
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fibnm1 = fib(n - 1);
		int fibnm2 = fib(n - 2);
		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static int fibRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fibnm1 = fibRS(n - 1, strg);
		int fibnm2 = fibRS(n - 2, strg);
		int fibn = fibnm1 + fibnm2;
		strg[n] = fibn;
		return fibn;
	}

	public static int fibIS(int n) {
		int[] strg = new int[n + 1];
		// seed
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}
}
