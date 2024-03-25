package com.assignment9;

public class Que3 {

	public static void main(String[] args) {
		try{
		int[] arr = {10,20,30};
		for(int i =0; i<=arr.length; i++) {
			if(i> arr.length-1)throw new ArrayIndexOutOfBoundsException("index range is from 0 to 2, 3 is out of bound");
			System.out.println(arr[i]);
		}
		}catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}

}
