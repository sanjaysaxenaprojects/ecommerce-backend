package com.sanjaysaxena.ecommercebackend.controller;

import com.sanjaysaxena.ecommercebackend.dto.cart.AddToCartRequest;
import com.sanjaysaxena.ecommercebackend.dto.cart.AddToCartResponse;
import com.sanjaysaxena.ecommercebackend.dto.cart.GetCartItemsResponse;
import com.sanjaysaxena.ecommercebackend.dto.cart.UpdateCartRequest;
import com.sanjaysaxena.ecommercebackend.entity.Cart;
import com.sanjaysaxena.ecommercebackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/hi")
    public String hi(){
        return "Working";
    }

    @PostMapping("/cart/items")
    public AddToCartResponse addItem(@RequestBody AddToCartRequest request){
        return cartService.addItem(request);
    }

    @GetMapping("/cart/items")
    public GetCartItemsResponse getItems(){
        GetCartItemsResponse response=new GetCartItemsResponse();
        response.setItems(cartService.getItem());
        return response;
    }

    @DeleteMapping("/cart/items/{cartItemId}")
    public String deleteItem(@PathVariable("cartItemId") String cartItemId){
        cartService.deleteItem(cartItemId);
        return "Deleted Successfully!";
    }

    @PutMapping("/cart/items/{cartItemId}")
    public String updateItem(@PathVariable("cartItemId") String cartItemId, @RequestBody UpdateCartRequest request){

        cartService.updateItem(cartItemId,request);
        return "Updated Successfully!";
    }

}
