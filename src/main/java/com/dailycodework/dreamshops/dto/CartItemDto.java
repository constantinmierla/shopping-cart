package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.Cart;
import com.dailycodework.dreamshops.model.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private Long id;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private Product product;
    private Cart cart;
}
