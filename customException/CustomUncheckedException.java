package com.customException;

public class CustomUncheckedException extends RuntimeException{
	

	public CustomUncheckedException() {
		super("Invalid age");
	}

	public CustomUncheckedException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {

		int a = 19;
		if(a<18) {
			throw new CustomUncheckedException();
		}else {
			System.out.println("age is valid");
		}
	}

}
