package com.example.cardapio.entity;

import com.example.cardapio.dto.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

 

@Table(name = "foods")
@Entity(name = "foods")

//Essa anotação do Getter meio que cria os get para nos (exempl, getId() )
@Getter

//Essa do NoArgs cria um constructor vazio 
@NoArgsConstructor

//Essa do AllArgs cria o constructor com todos os campos
//ai permite criar o objeto passando todos os dados na hora, tipo: new Classe(campo1, campo2 e etc)
@AllArgsConstructor

//Essa do EqualsAndHash faz com que o programa considere dois objetos iguais
//só se eles tiverem o mesmo valor "id".
//ai o (of = id) significa que ele vai considerar so o id
//Ou seja, só olha o "id" para saber se são iguais ou não.

@EqualsAndHashCode(of = "id")

public class Food {
	// Aqui diz que esse campo "id" é a chave principal da tabela (identificador único)
	@Id
	//O GeneratedValue diz que o "id" será criado automaticamente pelo banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;  // Guarda o título/nome da comida
	private String image;  // Guarda o link ou nome da imagem da comida
	private Integer price; // Guarda o preço da comida

	// Esse é um Construtor que cria um objeto Food pegando os dados de um objeto FoodRequestDTO
	// Ele copia a imagem, preço e título de data para este objeto Food
	public Food(FoodRequestDTO data){
	    this.image = data.image();
	    this.price = data.price();
	    this.title = data.title();
	}

	
}
