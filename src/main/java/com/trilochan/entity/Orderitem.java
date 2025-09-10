package com.trilochan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Orderitem {
    @Id
    @SequenceGenerator(name = "seq", sequenceName = "ORDER_ITEM_ID_SEQ", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Food food;

    private Integer quantity;

    private Double totalPrice;

    private List<String> ingredients;

}
