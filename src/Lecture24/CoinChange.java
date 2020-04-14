package Lecture24;

class CoinChange {

	  public static int[][] cache = new int[1000][1000];

	  public static int coinChangeRecursive(int[] coins, int numCoins, int value) {
	    if (value == 0)
	      return 1;

	    if (value < 0)
	      return 0;

	    if (numCoins <= 0 && value > 0)
	      return 0;

	    return coinChangeRecursive(coins, numCoins - 1, value)
	        + coinChangeRecursive(coins, numCoins, value - coins[numCoins - 1]);
	  }

	  public static int coinChangeRecursiveMemo(int[] coins, int numCoins, int value) {
	    if (value == 0)
	      return 1;

	    if (value < 0)
	      return 0;

	    if (numCoins <= 0 && value > 0)
	      return 0;

	    if (cache[numCoins][value] != -1) {
	      return cache[numCoins][value];
	    }
	    cache[numCoins][value] = coinChangeRecursiveMemo(coins, numCoins - 1, value)
	        + coinChangeRecursiveMemo(coins, numCoins, value - coins[numCoins - 1]);

	    return cache[numCoins][value];
	  }

	  public static int coinChangeBottomUp(int[] coins, int value) {

	    for (int i = 0; i <= coins.length; i++) {
	      for (int j = 0; j <= value; j++) {
	        if (i == 0) {
	          cache[i][j] = 0;
	        } else if (j == 0) {
	          cache[i][j] = 1;
	        }
	      }
	    }

	    for (int i = 1; i <= coins.length; i++) {
	      for (int j = 1; j <= value; j++) {

	        if (coins[i - 1] <= j) {
	          cache[i][j] = cache[i][j - coins[i - 1]] + cache[i - 1][j];
	        } else {
	          cache[i][j] = cache[i - 1][j];
	        }
	      }
	    }
	    return cache[coins.length][value];
	  }

	  public static void main(String[] args) {
	    int[] coins = { 1, 2, 3 };
	    int value = 5;
	    System.out.println(coinChangeRecursive(coins, coins.length, value));

	    for (int i = 0; i < cache.length; i++) {
	      for (int j = 0; j < cache.length; j++) {
	        cache[i][j] = -1;
	      }
	    }
	    System.out.println(coinChangeBottomUp(coins, value));
	  }
	}
