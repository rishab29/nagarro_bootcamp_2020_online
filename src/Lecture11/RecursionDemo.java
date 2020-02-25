package Lecture11;

public class RecursionDemo {
	public static String[] arr={"zero", "one","two","three","four","five","six","seven","eight","nine"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);
		PI(5);
		PDI(5);

//			
		
		System.out.println(fact(5));
		System.out.println(fib(5));
	    ItoS(1234);
	    System.out.println();
	    int[] arr={3,2,15,4,6};
        System.out.println(sum1(arr,0));
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);

	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int fnm1 = fact(n - 1);
		int fn = n * fnm1;
		return fn;
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

	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			boolean restans = isSorted(arr, si + 1);
			return restans;
		}
	}
	
	public static void ItoS(int n){
        if(n==0){
            return;
        }

        int rem=n%10;
        n=n/10;
        ItoS(n);
        System.out.print(arr[rem]+" ");
    }
	
	 public static int sum1(int[] arr,int i){
	        if(i==arr.length){
	            return 0;
	        }

	        int ans=arr[i]+sum1(arr,i+1);
	        return ans;
	    }

}
