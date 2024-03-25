package com.assignment9;

public class demo {

	public static void main(String[] args) {
		
		
		try {
			int[] arr = new int[-3];
		}catch(NegativeArraySizeException ex) {
			ex.printStackTrace();
		}
	}

}
