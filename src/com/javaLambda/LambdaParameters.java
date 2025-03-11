package com.javaLambda;

interface Addable{
	int addition(int a, int b);
}


public class LambdaParameters {
	public static void main(String[] args) {
		
		
		Addable add =  (a, b) ->  (a + b);
		int result = add.addition(10, 20);
		System.out.println(result);
	}
}
