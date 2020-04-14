package Lecture25;

import java.util.ArrayList;

public class WineProblems {
	public static ArrayList<Integer> pricelist = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pricelist.add(1);
		pricelist.add(3);
		pricelist.add(1);
		pricelist.add(5);
		pricelist.add(2);

		System.out.println(wineProblemRecursive(0, pricelist.size() - 1));
        int[][] strg=new int[pricelist.size()+1][pricelist.size()+1];
        System.out.println(wineProblemRecursiveRS(0, pricelist.size() - 1, strg));
	
        System.out.println(wineProblemIS(pricelist.size()-1));
	
	}

	public static int wineProblemRecursive(int be, int en) {
		if (be > en) {
			return 0;
		}

		int day = pricelist.size() - (en - be + 1) + 1;

		return Math.max(day * pricelist.get(be) + wineProblemRecursive(be + 1, en),
				day * pricelist.get(en) + wineProblemRecursive(be, en - 1));
	}

	public static int wineProblemRecursiveRS(int be, int en, int[][] strg) {
		if (be > en) {
			return 0;
		}
		if (strg[be][en] != 0) {
			return strg[be][en];
		}
		int day = pricelist.size() - (en - be + 1) + 1;

		strg[be][en] = Math.max(day * pricelist.get(be) + wineProblemRecursive(be + 1, en),
				day * pricelist.get(en) + wineProblemRecursive(be, en - 1));

		return strg[be][en];

	}
	
	public static int wineProblemIS(int n) {
		int[][] strg=new int[pricelist.size()][pricelist.size()];
		
		for(int en=n;en>=0;en--) {
			for(int be=0;be<=n;be++) {
				int day=pricelist.size()-(be-en+1)+1;
				if(be==en) {
					strg[en][be]=pricelist.get(en)*day;
				}else if(en<be) {
					strg[en][be]=Math.max(pricelist.get(en)*day+strg[en+1][be],
							              pricelist.get(be)*day+strg[en][be-1]);
				}
			}
		}
		
		return strg[0][n];
	}

}
