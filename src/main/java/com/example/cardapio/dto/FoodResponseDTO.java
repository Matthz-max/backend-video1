package com.example.cardapio.dto;

import com.example.cardapio.entity.Food;

//Aqui temos um dto record, que serve para guarda as 
//informações e usar de um modo mais simples e rapido 
public record FoodResponseDTO(Long id, String title, String image, Integer price) {
	
	// metodo que serve como o Getters que normalmente fariamos no Entity
	//foi possivel atraves da anotação Getter do lombok 
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
    
}
