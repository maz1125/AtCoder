package com.matsuda_d.a_087;

import java.util.Scanner;

public class A_BuyingSweets {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int initialAmount = Integer.parseInt(scanner.nextLine());
			int aAmount = Integer.parseInt(scanner.nextLine());
			int bAmount = Integer.parseInt(scanner.nextLine());
			System.out.println((initialAmount-aAmount)%bAmount);
		}
	}

	// scanner.nextInt()でいける
}
