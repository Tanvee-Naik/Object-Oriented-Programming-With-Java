package com.example;

public class que9 {

	public static void main(String[] args) {
		int n = 0;
		for(int i = 5; i>1; i--) {
			
			for(int j =4; j>=i; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j =1+n; j<=5; j++) {
				
				System.out.print(j +" ");
				
			}
			System.out.println();
			n++;
			

		}
		
		
		int m = 5;
		for(int i = 1; i<=6; i++) {
			
			for(int j =4; j>=i; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j =1+m; j<=5; j++) {
				
				System.out.print(j +" ");
				
			}
			//System.out.println(" ");
			m--;
			System.out.println();

		}

	}
}
