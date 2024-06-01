package com.sanjaysaxena.ecommercebackend.service;

import com.sanjaysaxena.ecommercebackend.dto.cart.AddToCartRequest;
import com.sanjaysaxena.ecommercebackend.dto.cart.AddToCartResponse;
import com.sanjaysaxena.ecommercebackend.dto.cart.UpdateCartRequest;
import com.sanjaysaxena.ecommercebackend.entity.Cart;
import com.sanjaysaxena.ecommercebackend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public AddToCartResponse addItem(AddToCartRequest request) {
        Cart addToCart = new Cart();
        addToCart.setCartItemId(request.getProductId());
        Cart cart = cartRepository.save(addToCart);
        return AddToCartResponse.builder().cartItemId(cart.getCartItemId()).message("Working").build();
    }

    public List<Cart> getItem() {
        return cartRepository.findAll().stream().limit(10).toList();
    }

    public void deleteItem(String cartItemId) {
        cartRepository.deleteById(cartItemId);
    }

    public void updateItem(String cartItemId, UpdateCartRequest request) {
        Cart cart = cartRepository.getReferenceById(cartItemId);
        cart.setQuantity(request.getQuantity());
        cartRepository.save(cart);
    }
}
