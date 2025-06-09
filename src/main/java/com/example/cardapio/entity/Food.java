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
//essa anotação do Getter cria para os get,(exemplo getId() )
@Getter
//essa do no args
@NoArgsConstructor
//essa do all args
@AllArgsConstructor
//essa do equal
@EqualsAndHashCode(of = "id")
public class Food {

    //aqui
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
	
    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

	
}
