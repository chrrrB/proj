package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FOOD")
public class Food {
	// Id is necessary for each table to be identified as unique identifier
	@Id
	@Column(name="FOODID")
	private Long foodId;
	@Column(name="FOODNAME")
	private String foodName;
	@Column(name="CALORIES")
	private Integer calories;
	@Column(name="PROTEIN")
	private Integer protein;
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(Long i, String n, Integer a, Integer b) {
		foodId = i;
		foodName = n;
		calories = a;
		protein = b;
	}
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	
	public Integer getProtein() {
		return protein;
	}
	public void setProtein(Integer protein) {
		this.protein = protein;
	}
	
	@Override
	public String toString() {
		return "Food{" + "id=" + this.foodId + ", name='" +
				this.foodName + "', calories='" + this.calories + ", protein='" + this.protein + "'}";
	}
	

}
