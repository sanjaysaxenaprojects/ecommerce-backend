package com.sanjaysaxena.ecommercebackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="cart")
public class Cart {
    @Id
    private String cartItemId;
    private String productId;
    private int quantity;
}
