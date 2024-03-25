package com.assignment9;

import java.util.Scanner;

public class Que2 {
	
	public static void check(int num) throws Exception {
		if((num%2)==1)throw new Exception("Enter only Even number. ");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		Que2.check(sc.nextInt());

	}

}
