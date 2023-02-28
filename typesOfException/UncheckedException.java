package com.typesOfException;

public class UncheckedException {

	public static void main(String[] args) {
		int a,b,c;
		a=100;
		b=0;
		c=a/b;
		System.out.println(c);
	}

}
// <------------------------------Unchecked Exception---------------------------------------->
//	-Unchecked exceptions occur at runtime.
//	-The compiler does not check these types of exceptions.
//	-These types of exceptions cannot be a catch or handle at the time of compilation, 
//	 because they get generated by the mistakes in the program.
//	-They are runtime exceptions and hence are not a part of the Exception class.

//	Examples of Unchecked Exceptions:
//	-No Such Element Exception
//	-Undeclared Throwable Exception
//	-Empty Stack Exception
//	-Arithmetic Exception
//	-Null Pointer Exception
//	-Array Index Out of Bounds Exception
//	-Security Exception