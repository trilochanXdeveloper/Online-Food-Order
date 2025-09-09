package com.trilochan.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @SequenceGenerator(name = "seq", sequenceName = "ORDER_ID_SEQ", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(generator = "seq", strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @JsonIgnore
    @ManyToOne

    private Restaurent restaurant;

    private Double totalAmount;

    private String orderStatus;

    private Date createdAt;

    @ManyToOne
    private Address deliveryAddress;

    @OneToMany
    private List<Orderitem> items;

    // private Payment payment;

    private Double totalItem;

    private Double totalPrice;
}
