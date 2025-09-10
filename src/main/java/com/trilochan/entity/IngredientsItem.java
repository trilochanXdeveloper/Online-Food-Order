package com.trilochan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItem {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "RESTAURANT_ID_SEQ",initialValue = 10,allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private IngredientCategory category;


    @ManyToOne
    private Restaurent restaurent;

    private Boolean inStoke=true;

}
