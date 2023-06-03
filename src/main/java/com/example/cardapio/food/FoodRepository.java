package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
    record FoodRequestDTO(String title, String image, Integer price) {
    }
}