package com.workintech.s112g2.fruitsproject.controller;


import com.workintech.s112g2.fruitsproject.entity.Fruit;
import com.workintech.s112g2.fruitsproject.services.FruitService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
@Validated
public class FruitController {
    private FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService) {

        this.fruitService = fruitService;
    }
    @GetMapping("/")
    public List<Fruit> get(){
        return fruitService.findAll();
    }
    @GetMapping("/{id}")
    public Fruit getById(@Positive @PathVariable int id){
        Fruit fruit =  fruitService.find(id);
        //todo
        return fruit;
    }
        @GetMapping("/desc")
        public List<Fruit> getByPriceDesc(){

        return fruitService.findAllByPriceDesc();
        }

        @PostMapping("/")
        public Fruit save(@Validated @RequestBody Fruit fruit){

        return fruitService.save(fruit);
        }

        @PostMapping("/{name}")//Post yaptik cunku  @GetMapping("/{id}") ile cakisiyor
        public List<Fruit> getByName(@PathVariable String name){

        return fruitService.searchByName(name);
        }

        @DeleteMapping("/{id}")
        public Fruit delete(@PathVariable int id){
            Fruit fruit = getById(id);
            fruitService.delete(fruit);
            return fruit;
        }
}
