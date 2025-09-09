package com.trilochan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurent {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "RESTAURANT_ID_SEQ",initialValue = 10,allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.IDENTITY)
     private Long id;
    owner;
    name;
    description;
    cuisineType;
    address;
    contactInformation;
    openingHours;
    reviews;
    orders;
    numRating;
    images;
    registrationDate;
    open;
    foods;
}
