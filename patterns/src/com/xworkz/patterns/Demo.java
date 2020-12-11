package com.xworkz.patterns;

public class Demo {
	public static void main(String[] args) {

		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
