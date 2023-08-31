package com.workintech.s112g2.fruitsproject.dao;


import com.workintech.s112g2.fruitsproject.entity.Fruit;
import com.workintech.s112g2.fruitsproject.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Integer> {

    @Query("SELECT v FROM vegetable v ORDER BY v.price DESC")
    List<Vegetable> getByPriceDesc();

    @Query("SELECT v FROM vegetable v ORDER BY v.price")
    List<Vegetable> getByPriceAsc();

    @Query("SELECT v FROM vegetable v WHERE v.name ilike %:name%")
    List<Vegetable> searchByName(String name);
}
