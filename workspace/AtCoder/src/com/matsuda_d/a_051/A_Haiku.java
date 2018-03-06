package com.matsuda_d.a_051;

import java.util.Scanner;

public class A_Haiku {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String input = sc.nextLine();
			String output = input.replace(",", " ");
			System.out.println(output);
		}
	}
}
// 2 min