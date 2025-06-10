package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.dto.FoodRequestDTO;
import com.example.cardapio.dto.FoodResponseDTO;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repository.FoodRepository;

//anotação Rest e Request 
@RestController
@RequestMapping("food")
public class FoodController {

	@Autowired
	private FoodRepository repository;

	// Essa anotação de cross faz como que o Post possa ser feito de qualquer endereço
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    
	  @PostMapping
	    public void saveFood(@RequestBody FoodRequestDTO data){
	        Food foodData = new Food(data);
	        repository.save(foodData);
	        return;
	    }

	// Essa anotação de cross faz como que o Get possa ser feito de qualquer endereço
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    
	 @GetMapping
	    public List<FoodResponseDTO> getAll(){

	        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
	        return foodList;
	    }
}
