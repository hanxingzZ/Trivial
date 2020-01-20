package com.suanfa.fib;

public class FibTest {

	public static int fib1(int n) {
		if (n < 3) {
			return n == 0 ? 0 : 1;
		}

		return fib1(n - 1) + fib1(n - 2);

	}

	public static int fib2(int n) {
		return fib2(1, 1, n);
	}

	private static int fib2(int one, int two, int n) {

		if (n < 3) {
			return n == 0 ? 0 : 1;
		}
		if (n == 3) {
			return one + two;
		}
		return fib2(two, one + two, n - 1);
	}

	public static int fib3(int n) {
		if (n <= 0)
			return 0;
		int temp = 0;
		int one = 1;
		int two = 1;
		for (int i = 3; i <= n; i++) {
			temp = one + two;
			one = two;
			two = temp;
		}
		return two;
	}

	public static int countFib(int n) {

		int index = 0;
		int one = 1;
		int two = 1;
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int sum = 2;
		for (int i = 3; i <= n; i++) {
			index = one + two;
			one = two;
			two = index;
			sum += two;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 5;

		// long s3 = System.currentTimeMillis();
		// System.out.println("fib3：" + n + "~~~" + fib3(n));
		// System.out.println("countFib：" + n + "~~~" + countFib(n));
		//
		// System.out.println("fib3：" + (System.currentTimeMillis() - s3));
		//
		// long s2 = System.currentTimeMillis();
		// System.out.println("fib2：" + n + "~~~" + fib2(n));
		// System.out.println("fib2：" + (System.currentTimeMillis() - s2));
		//
		// long s1 = System.currentTimeMillis();
		// System.out.println("fib1：" + n + "~~~" + fib1(n));
		// System.out.println("fib1：" + (System.currentTimeMillis() - s1));

		// Integer[] arr1 = { 1, 2, 3, 4, 5 };
		//
		// System.arraycopy(arr1, 3, arr1, 2, 2);
		// for (Integer a : arr1) {
		// System.out.println(a);
		// }
		String str = "123";
		str.toCharArray();

		String str1 = "12";
		String str2 = "2";

		System.out.println(str.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str.compareTo(str2));

	}

}
