package Lecture25;

public class N_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, k = 3;
		System.out.println(N_Stairs(n, k));
		int[] strg = new int[n + 1];
		System.out.println(N_StairsRS(n, k, strg));
		System.out.println(N_StairsIS(n, k));
	}

	public static int N_Stairs(int n, int k) {
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		int ans = 0;
		for (int i = 1; i <= k; i++) {
			ans = ans + N_Stairs(n - i, k);
		}

		return ans;
	}

	public static int N_StairsRS(int n, int k, int[] strg) {
		if (n == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		if (strg[n] != 0) {
			return strg[n];
		}
		int ans = 0;
		for (int i = 1; i <= k; i++) {
			ans = ans + N_Stairs(n - i, k);
		}

		strg[n] = ans;
		return ans;
	}

	public static int N_StairsIS(int n, int k) {
		int[] strg = new int[n + 1];
		strg[0] = 1;

		for (int stair = 1; stair <= n; stair++) {
			int sum = 0;
			for (int i = 1; i <= k; i++) {
				if (stair - i >= 0) {
					sum = sum + strg[stair - i];
				}
			}

			strg[stair] = sum;
		}

		return strg[n];
	}

}
