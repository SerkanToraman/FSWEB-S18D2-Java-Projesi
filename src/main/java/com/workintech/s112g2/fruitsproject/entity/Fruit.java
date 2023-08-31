package com.workintech.s112g2.fruitsproject.entity;

import com.workintech.s112g2.fruitsproject.entity.enums.FruitType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fruit", schema = "s22g2jpaint")
public class Fruit extends Plant{
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
