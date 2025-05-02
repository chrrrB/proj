package com.example.springboot;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FoodController {
	
	@Autowired
	FoodRepository repository;
	
	
	@GetMapping("/foods")
	List<Food> all() {
		return repository.findAll();
	}

	
	
	@PostMapping("/foods")
	  Food newFood(@RequestBody Food newFood) {
		repository.save(newFood);
		return newFood;
	  }
	
	@GetMapping("/foods/{id}")
	  Food getFood(@PathVariable Long id) {
	    return repository.findById(id).orElseThrow(() -> new FoodNotFoundException(id));
	    
	}

	@PutMapping("foods/{id}")
	Food updateFood(@RequestBody Food rFood, @PathVariable Long id) {
		Food updatedFood = repository.findById(id) //
			      .map(food -> {
			    	  food.setFoodName(rFood.getFoodName());
			    	  food.setCalories(rFood.getCalories());
			        return repository.save(food);
			      })
			      .orElseGet(() -> {
			    	  rFood.getFoodId();
			        return repository.save(rFood);
			      });
		  return null;
	}
	
	@DeleteMapping("foods/{id}")
	void deleteFood(@PathVariable Long id) {	
			repository.deleteById(id);
	}
}
