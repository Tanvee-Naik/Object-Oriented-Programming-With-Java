package com.assignment9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = null;
		 
		try {
		sc = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num1 = sc.nextInt();
		System.out.print(" Enter Number: ");
		int num2 = sc.nextInt();
		if(num2 == 0)throw new ArithmeticException("devide by zero");
			
		int res = num1/num2;
		System.out.print(" Result : "+res);
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		catch (InputMismatchException ex) {
			ex.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}


