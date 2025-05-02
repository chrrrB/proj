package com.example.springboot;

import java.util.ArrayList;

public class Foods {
	private ArrayList<Food> foods;

	public Foods() {
		foods = new ArrayList<Food>();
		foods.add(new Food(1L,"Brand Chicken",150,25));
		foods.add(new Food(2L,"Other brand chicken", 200, 20));
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}
	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}

}
