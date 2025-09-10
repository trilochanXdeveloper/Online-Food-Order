package com.trilochan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategory {
    @Id
    @SequenceGenerator(name = "seq", sequenceName = "RESTAURANT_ID_SEQ", initialValue = 10, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToOne
    private Restaurent restaurent;

    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
    private List<IngredientsItem> ingredients = new ArrayList<>();
}
