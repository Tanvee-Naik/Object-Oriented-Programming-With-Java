package com.example;

public class que24 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			int n = i;
			int m = 4;
			for(int j = 1; j<=i; j++) {
				
				System.out.print(n+" ");
				
				n= n+(m--);
				//m--;
				
			}
			System.out.println();
		}

	}

}
