package com.sanjaysaxena.ecommercebackend.dto.cart;

import lombok.Data;

@Data
public class AddToCartRequest {
    private String cartItemId;
    private String productId;
    private int quantity;
}
