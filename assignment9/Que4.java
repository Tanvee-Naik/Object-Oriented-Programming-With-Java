package com.assignment9;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter no: ");
		int n1 = sc.nextInt();
		System.out.print("Enter no: ");
		int n2 = sc.nextInt();
		int res = n1/n2;
		System.out.println("result: "+res);
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		catch(RuntimeException ex){
			ex.printStackTrace();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		catch(Throwable ex){
			ex.printStackTrace();
		}
	}

}
