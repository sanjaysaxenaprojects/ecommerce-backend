package com.sanjaysaxena.ecommercebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return quantity == cart.quantity && Objects.equals(cartItemId, cart.cartItemId) && Objects.equals(productId, cart.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartItemId, productId, quantity);
    }
}
