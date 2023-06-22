package com.demo.test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.demo.exceptions.WrongAgeException;

public class TestCustomException {
	public static void acceptdata() throws WrongAgeException {//throws used with method
		Scanner sc=new Scanner(System.in);
	    System.out.println("enetr age");
		int age=sc.nextInt();
		if((age <18) || (age>60))
			throw new WrongAgeException("age should be between 18 and 60"); //unchecked exception created
		System.out.println(age);
	}
public static void main(String[] args) {
	try {
	   acceptdata();
	}catch(WrongAgeException e) {
		System.out.println(e.getMessage());
	}
}
}
