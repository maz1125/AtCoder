package com.matsuda_d.a_085;

import java.util.Scanner;

public class A_Already_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append("2018");
		sb.append(s.substring(4, s.length()));
		System.out.println(sb.toString());
	}
}
