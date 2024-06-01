package com.sanjaysaxena.ecommercebackend.dto.cart;

import com.sanjaysaxena.ecommercebackend.entity.Cart;
import lombok.Data;

import java.util.List;

@Data
public class GetCartItemsResponse {
    private List<Cart> items;
}
