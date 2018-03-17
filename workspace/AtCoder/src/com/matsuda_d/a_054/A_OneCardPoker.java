package com.matsuda_d.a_054;

import java.util.Scanner;

public class A_OneCardPoker {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			execute(a, b);
		}
	}

	private static void execute(int a, int b) {
		if(a == b) {
			System.out.println("Draw");
		}  else if (a == 1){
			System.out.println("Alice");

		}  else if (b == 1){
			System.out.println("Bob");

		}  else if (a > b){
			System.out.println("Alice");

		} else {
			System.out.println("Bob");

		}

	}
}
