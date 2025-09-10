package com.trilochan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "FOOD_ID_SEQ", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    @ManyToOne
    private Category foodCategory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private Boolean available;

    @ManyToOne
    private Restaurent restaurent;

    private Boolean isVegetarian;

    private Boolean isSeasonal;

    @ManyToMany
    List<IngredientsItem> ingredients = new ArrayList<>();

    private Date creationDate;
}
