package com.matsuda_d.a_089;

import java.util.Scanner;

public class D_PracticalSkillTest {

	private static Integer BEST_GROUP_NUMBER = 3;

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(sc.nextInt()/BEST_GROUP_NUMBER);
		}
	}
}
