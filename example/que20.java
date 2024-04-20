package com.example;

public class que20 {

	public static void main(String[] args) {
		int n = 0;
		for(int i =7; i>=1; i--) {
			
			for(int j =6; j>=i; j--)
				System.out.print(" ");
			
			for(int j =1; j<=i; j++) {
				System.out.print(j+n);
			}
			n++;
			System.out.println();
		}

	}

}
