package com.typesOfException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args)  {
		
		try {
			FileInputStream f1 = new FileInputStream("Desktop/1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
//-----------------------------------Checked Exception---------------------
// - The compiler checks a checked exception.
// - These types of exceptions can be handled at the time of compilation.
// - Need to catch exception by try/catch or Throws key word.

// 	Examples of Checked exceptions:
//	-File Not Found Exception
//	-No Such Field Exception
//	-Interrupted Exception
//	-No Such Method Exception
//	-Class Not Found Exception