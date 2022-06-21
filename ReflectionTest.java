package com.aurionpro.test;

import com.aurionpro.model.Reflection;

public class ReflectionTest {
	public static void main(String[] args) {
		
		//Reflection reflection = new Reflection();
		try {
			Reflection.getDetail(Class.forName(args[0]));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
