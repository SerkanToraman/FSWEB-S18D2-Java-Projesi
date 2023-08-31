package com.workintech.s112g2.fruitsproject.entity;

import com.workintech.s112g2.fruitsproject.entity.enums.FruitType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fruit", schema = "s22g2jpaint")
public class Fruit extends Plant{
    @Enumerated(EnumType.STRING)
    @Column(name="fruit_type")
    private FruitType type;

}
