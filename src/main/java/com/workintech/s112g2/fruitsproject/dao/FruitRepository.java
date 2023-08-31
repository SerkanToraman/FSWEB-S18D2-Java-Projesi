package com.workintech.s112g2.fruitsproject.dao;

import com.workintech.s112g2.fruitsproject.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Integer> {
    @Query("SELECT f FROM fruit f ORDER BY f.price DESC")
    List<Fruit> getByPriceDesc();

    @Query("SELECT f FROM fruit f ORDER BY f.price")
    List<Fruit> getByPriceAsc();

    @Query("SELECT f FROM fruit f WHERE f.name ilike %:name%")
    List<Fruit> searchByName(String name);
}
