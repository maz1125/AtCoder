package com.matsuda_d.a_084;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_PostalCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		Pattern p = Pattern.compile("^[0-9]{" + A +"}"+"[-]"+"[0-9]{" + B + "}$");
		Matcher m = p.matcher(S);
		System.out.println(m.find() ? "Yes":"No");

		///// 以下復習内容////////////////////////////
		//		２番めの引数が0の場合、末尾の空の要素は削除される
		//		S.split("-", 0);
		//		[0-9] = //d
	}
}
