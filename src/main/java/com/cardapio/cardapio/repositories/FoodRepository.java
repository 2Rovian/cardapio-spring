package com.cardapio.cardapio.repositories;

import com.cardapio.cardapio.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
}
