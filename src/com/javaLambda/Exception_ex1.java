package com.javaLambda;

import java.util.Scanner;

public class Exception_ex1 {
	public static int divideNumbers(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Cannot divided the given number by Zero!");
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a dividend num: ");
			int a = sc.nextInt();
			System.out.println("Enter a divisor num: ");
			int b = sc.nextInt();
			int result = divideNumbers(a, b);
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
