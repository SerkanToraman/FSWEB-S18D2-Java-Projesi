package com.workintech.s112g2.fruitsproject.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegetable", schema = "s22g2jpaint")
public class Vegetable extends Plant{
    @Column(name ="is_grown_on_tree")
    private boolean isGrownOnTree;
}
