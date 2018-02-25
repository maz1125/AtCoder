package com.matsuda_d.a_086;

import java.util.Scanner;

public class C_Traveling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		int t = 0;
		int x = 0;
		int y = 0;
		for(int n = 0 ; n < count ; n++) {
			int ti = sc.nextInt();
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			int absX = Math.abs(xi -x);
			int absY = Math.abs(yi -y);
			int rest = (ti - t) - absX - absY;
			if(rest < 0 || rest%2 != 0) {
				System.out.println("No");
				return;
			} else {
				t = ti;
				x = xi;
				y = yi;
			}
		}
			System.out.println("Yes");
	}
}
