package com.workintech.s112g2.fruitsproject.services;

import com.workintech.s112g2.fruitsproject.entity.Fruit;
import com.workintech.s112g2.fruitsproject.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> findAll();
    List<Vegetable> findAllByPriceDesc();
    List<Vegetable> findAllByPriceAsc();
    List<Vegetable> searchByName(String name);
    Vegetable find(int id);
    Vegetable save(Vegetable vegetable);
    void delete(Vegetable vegetable);
}
