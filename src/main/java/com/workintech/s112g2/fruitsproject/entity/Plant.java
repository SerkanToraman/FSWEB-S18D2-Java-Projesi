package com.workintech.s112g2.fruitsproject.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass // Bunun sql de datasi olamaycak demek
public class Plant {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    @NotNull
    @NotBlank
    @Size(min = 4, max = 45, message = "Name size must be between 4 to 45")
    private String name;

    @Column(name="price")
    @DecimalMin("5")
    private double price;
}
