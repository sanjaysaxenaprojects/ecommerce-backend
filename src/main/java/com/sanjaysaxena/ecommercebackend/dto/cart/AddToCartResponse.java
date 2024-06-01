package com.sanjaysaxena.ecommercebackend.dto.cart;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddToCartResponse {
    private String message;
    private String cartItemId;
}
