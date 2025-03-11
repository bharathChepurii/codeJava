package com.javaLambda;

import java.util.Scanner;

class UserNotEligibleToVote extends Exception{
	UserNotEligibleToVote(String s){
		System.out.println(s);
	}
}

public class UserDefinedException {
	void voterAge(int age) throws UserNotEligibleToVote {
		if (age < 18) {
			throw new UserNotEligibleToVote("Age is not sufficient");
		}
		else {
			System.out.println("You can Eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Users age: ");
		int age = sc.nextInt();
		
		try {
			obj.voterAge(age);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			
		}
	}
}
