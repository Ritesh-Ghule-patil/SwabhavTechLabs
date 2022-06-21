package com.aurionpro.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
			
	public static void getDetail(Class inputClass)
	{
		System.out.print("\nName of the Class is : "+ inputClass.getName() +"\n \n" );
		System.out.println("-----------------------------------------------------------------------------\n");
		
		Field field[] = inputClass.getDeclaredFields();
		System.out.println("List of Field of -> "+ inputClass.getName() +" Class Are ->\n");
		int number =0;
		for(Field f : field) {
			System.out.println(++number +". "+ f);
		}
		System.out.println("\n---------------------------------------------------------------------------\n");
		System.out.println("List of Methods of -> "+ inputClass.getName() +" Class Are ->\n" );
		
		Method[] methods = inputClass.getDeclaredMethods();
		number =0;
		for(Method m : methods) {
			System.out.println(++number +". "+ m);
		}
	}
	
}
