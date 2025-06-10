package com.example.cardapio.dto;

// Aqui temos um dto record, que serve para guarda as 
// informações e usar de um modo mais simples e rapido
public record FoodRequestDTO(String title, String image, Integer price) {

}
