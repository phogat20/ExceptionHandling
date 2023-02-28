package com.customException;

public class CustomCheckedException extends Exception {
	
	
	
	public CustomCheckedException() {
		super("Invalid age");
	}

	public CustomCheckedException(String message) {
		super(message);
	}

	public static void main(String[] args) throws CustomCheckedException {
		
		int age = 14;
		
		if(age<18) {
			throw new  CustomCheckedException();
		}else {
			System.out.println("Valid!!");
		}
	}

}
