package Lecture13;

import java.util.Scanner;

public class n_stairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(nstairs(3));

	}

	public static int nstairs(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		int ans = nstairs(n - 1) + nstairs(n - 2) + nstairs(n - 3);
		return ans;

	}
}
