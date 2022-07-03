package com.aurionpro.bookcricket.model;

import java.util.Random;

public class Book {
	
	public int getPageNumber() {
		Random rand = new Random();
		
		return rand.nextInt(301);
	}

}
