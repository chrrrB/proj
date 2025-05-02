package com.example.springboot;

public class FoodNotFoundException extends RuntimeException {

	public FoodNotFoundException(Long id) {
		super("Can not find Food with id " + id);
	}

}
