package com.matsuda_d.a_085;

import java.util.HashSet;
import java.util.Scanner;

public class B_KagamiMochi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		int size = set.size();
		int sizeFactorial = getFactorial(size);
		int result = 0;
		for(int j = 0 ; j < size ; j++) {
			int jFactorial = getFactorial(j);
			int sjFactorial = getFactorial(size-j);
			result +=sizeFactorial/(jFactorial*sjFactorial);
		}
//		System.out.println(result);
		System.out.println(size);
	}

	private static int getFactorial(int n) {
		int result =1;
		for(int i= 1 ; i <= n ;i++ ) {
			result = result * i;
		}
		return result;
	}
}
