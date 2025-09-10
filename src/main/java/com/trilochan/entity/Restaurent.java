package com.trilochan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurent {
    @Id
    @SequenceGenerator(name = "seq", sequenceName = "RESTAURANT_ID_SEQ", initialValue = 10, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User owner;

    private String name;

    private String description;

    private String cuisineType;

    @OneToOne
    private Address address;

    @Embedded
    private ContactInformation contactInformation;

    private String openingHours;

    private String reviews;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    private Integer numRating;

    @ElementCollection
    @Column(length = 1000)
    private List<String> images;

    private LocalDateTime registrationDate;

    private Boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurent",cascade = CascadeType.ALL)
    private List<Food> foods = new ArrayList<>();
}
