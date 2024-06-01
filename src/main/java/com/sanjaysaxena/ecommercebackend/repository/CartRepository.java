package com.sanjaysaxena.ecommercebackend.repository;

import com.sanjaysaxena.ecommercebackend.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,String> {

    void deleteByProductId(String productId);
}
