package com.matsuda_d.a_086;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A_Product {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Integer> inputList = Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
			if(inputList.get(0)%2 != 0 && inputList.get(1)%2 != 0 ) {
				System.out.println("Odd");
			}else {
				System.out.println("Even");
			}
		}

	}
}
