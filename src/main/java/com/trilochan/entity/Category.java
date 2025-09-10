package com.trilochan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @SequenceGenerator(name = "seq",sequenceName = "CATEGORY_ID_SEQ",initialValue = 100,allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JsonIgnore
    private Restaurent restaurent;

}
