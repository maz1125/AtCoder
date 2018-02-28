package com.matsuda_d.a_088;

import java.util.Scanner;

public class A_InfiniteCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		if(n%500 > a) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}

//3分